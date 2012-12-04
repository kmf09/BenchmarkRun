/*
 * Author: Ira Ray Jenkins
 * and Katrina Fishman
 */
package edu.fsu.cs.mobile.benchmarks.test;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import edu.fsu.cs.mobile.benchmarks.BenchmarkLauncher;

public class BenchmarkRun extends
		ActivityInstrumentationTestCase2<BenchmarkLauncher> {

	public BenchmarkRun() { super(BenchmarkLauncher.class); }

	public void testDijkstraLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "dijkstra");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDijkstraLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "dijkstra");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDijkstraSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "dijkstra");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDijkstraSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "dijkstra");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/

	public void testEuclid() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "euclid");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testEuclidNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "euclid");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testFibonacciLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "nfib");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFibonacciLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "nfib");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFibonacciSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "nfib");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFibonacciSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "nfib");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testHuffCodeLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "huffcode");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHuffCodeLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "huffcode");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHuffCodeSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "huffcode");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHuffCodeSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "huffcode");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testKMPLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "kmp");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testKMPLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "kmp");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testKMPSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "kmp");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testKMPSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "kmp");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testMMultLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mmult");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMMultLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mmult");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMMultSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mmult");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMMultSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mmult");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testQSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "qsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testQSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "qsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testQSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "qsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testQSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "qsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testSubseqLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subseq");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubseqLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subseq");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubseqSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subseq");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubseqSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subseq");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testSubsetSumLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subsum");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubsetSumLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subsum");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubsetSumSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subsum");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubsetSumSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "subsum");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/

	public void testSubstrLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "substr");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubstrLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "substr");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubstrSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "substr");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testSubstrSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "substr");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testBubbleSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bubblesort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBubbleSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bubblesort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBubbleSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bubblesort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBubbleSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bubblesort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testHeapSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "heapsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHeapSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "heapsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHeapSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "heapsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testHeapSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "heapsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testMergeSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mergesort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMergeSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mergesort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMergeSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mergesort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testMergeSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "mergesort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testInsertionSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "insertionsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testInsertionSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "insertionsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testInsertionSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "insertionsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testInsertionSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "insertionsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testCountingSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "countingsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testCountingSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "countingsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testCountingSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "countingsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testCountingSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "countingsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testRadixSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "radixsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testRadixSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "radixsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testRadixSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "radixsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testRadixSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "radixsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testBucketSortLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bucketsort");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBucketSortLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bucketsort");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBucketSortSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bucketsort");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBucketSortSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bucketsort");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	/*******************************************************************/
	
	public void testDepthFirstSearchLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "depthfirstsearch");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDepthFirstSearchLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "depthfirstsearch");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDepthFirstSearchSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "depthfirstsearch");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testDepthFirstSearchSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "depthfirstsearch");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/

	public void testBreadthFirstSearchLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "breadthfirstsearch");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBreadthFirstSearchLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "breadthfirstsearch");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBreadthFirstSearchSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "breadthfirstsearch");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testBreadthFirstSearchSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "breadthfirstsearch");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testPrimLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "prim");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testPrimLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "prim");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testPrimSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "prim");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testPrimSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "prim");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testFFTNaiveLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftnaive");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTNaiveLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftnaive");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTNaiveSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftnaive");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTNaiveSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftnaive");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testFFTInPlaceLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftinplace");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTInPlaceLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftinplace");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTInPlaceSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftinplace");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testFFTInPlaceSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "fftinplace");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testLCSLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "lcs");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testLCSLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "lcs");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testLCSSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "lcs");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testLCSSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "lcs");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void testClosestPairNaiveLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "closestpairnaive");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testClosestPairNaiveLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "closestpairnaive");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testClosestPairNaiveSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "closestpairnaive");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void testClosestPairNaiveSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "closestpairnaive");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void BitonicLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bitonic");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BitnoicLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bitonic");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BitonicSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bitonic");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BitoincSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bitonic");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
	
	public void BiDirectionalLarge() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bidirectional");
		mIntent.putExtra("size", "large");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BiDirectinoalLargeNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bidirectional");
		mIntent.putExtra("size", "large");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BiDirectionalSmall() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bidirectinoal");
		mIntent.putExtra("size", "small");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity(); 
		synchronized (benchmark) { benchmark.wait(); }
	}

	public void BiDirectionalSmallNative() throws InterruptedException {
		Intent mIntent = new Intent();
		mIntent.putExtra("bench", "bidirectional");
		mIntent.putExtra("size", "small");
		mIntent.putExtra("native", "");
		setActivityIntent(mIntent);
		BenchmarkLauncher benchmark = getActivity();
		synchronized (benchmark) { benchmark.wait(); }
	}
	
	/*******************************************************************/
}
