package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.anon.Components
import typingsJapgolly.cytoscape.anon.ComponentsCut
import typingsJapgolly.cytoscape.anon.Cut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
trait CollectionAlgorithms extends StObject {
  
  /**
    * Perform the A* search algorithm on the elements in the collection.
    * This finds the shortest path from the root node to the goal node.
    * http://js.cytoscape.org/#eles.aStar
    */
  def aStar(options: SearchAStarOptions): SearchAStarResult
  
  /**
    * Perform the Bellman-Ford search algorithm on the elements in the collection.
    * This finds the shortest path from the starting node to all other nodes in the collection.
    * http://js.cytoscape.org/#eles.bellmanFord
    */
  def bellmanFord(options: SearchBellmanFordOptions): SearchBellmanFordResult
  
  /**
    * Considering only the elements in the calling collection,
    * calculate the betweenness centrality of the nodes.
    * http://js.cytoscape.org/#eles.betweennessCentrality
    */
  def betweennessCentrality(options: SearchBetweennessOptions): SearchBetweennessResult
  
  def bfs(options: SearchFirstOptions): SearchFirstResult
  
  /**
    * Perform a breadth-first search within the elements in the collection.
    * @param options
    * http://js.cytoscape.org/#eles.breadthFirstSearch
    * @alias bfs
    */
  def breadthFirstSearch(options: SearchFirstOptions): SearchFirstResult
  
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the specified root node.
    * http://js.cytoscape.org/#eles.closenessCentrality
    */
  def closenessCentrality(options: SearchClosenessCentralityOptions): Double
  
  /**
    * Considering only the elements in the calling collection,
    * calculate the closeness centrality of the nodes.
    * http://js.cytoscape.org/#eles.closenessCentralityNormalized
    */
  def closenessCentralityNormalized(options: SearchClosenessCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
  
  /**
    * Considering only the elements in the calling collection,
    * calculate the degree centrality of the specified root node.
    * http://js.cytoscape.org/#eles.degreeCentrality
    */
  def degreeCentrality(options: SearchDegreeCentralityOptions): SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected
  
  /**
    * Considering only the elements in the calling collection,
    * calculate the normalised degree centrality of the nodes.
    * http://js.cytoscape.org/#eles.degreeCentralityNormalized
    */
  def degreeCentralityNormalized(options: SearchDegreeCentralityNormalizedOptions): SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
  
  /**
    * Perform a depth-first search within the elements in the collection.
    * http://js.cytoscape.org/#eles.depthFirstSearch
    * @alias dfs
    */
  def depthFirstSearch(options: SearchFirstOptions): SearchFirstResult
  
  def dfs(options: SearchFirstOptions): SearchFirstResult
  
  /**
    * Perform Dijkstra's algorithm on the elements in the collection.
    * This finds the shortest paths to all other nodes in the collection from the root node.
    * http://js.cytoscape.org/#eles.dijkstra
    */
  def dijkstra(options: SearchDijkstraOptions): SearchDijkstraResult
  
  /**
    * Perform the Floyd Warshall search algorithm on the elements in the collection.
    * This finds the shortest path between all pairs of nodes.
    * http://js.cytoscape.org/#eles.floydWarshall
    */
  def floydWarshall(options: SearchFloydWarshallOptions): SearchFloydWarshallResult
  
  /**
    * finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnected(): Cut
  
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnectedComponents(): Cut
  
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htb(): Cut
  
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htbc(): Cut
  
  /**
    * Finds the minimum cut in a graph using the Karger-Stein algorithm.
    * The optimal result is found with a high probability, but without guarantee.
    * http://js.cytoscape.org/#eles.kargerStein
    */
  def kargerStein(): Components
  
  /**
    * Perform Kruskal's algorithm on the elements in the collection,
    * returning the minimum spanning tree, assuming undirected edges.
    * http://js.cytoscape.org/#eles.kruskal
    */
  def kruskal(handler: js.Function1[/* edge */ EdgeCollection, Double]): CollectionReturnValue
  
  /**
    * Rank the nodes in the collection using the Page Rank algorithm.
    * http://js.cytoscape.org/#eles.pageRank
    */
  def pageRank(options: SearchPageRankOptions): SearchPageRankResult
  
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnected(): ComponentsCut
  
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnectedComponents(): ComponentsCut
  
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tsc(): ComponentsCut
  
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tscc(): ComponentsCut
}
object CollectionAlgorithms {
  
  inline def apply(
    aStar: SearchAStarOptions => SearchAStarResult,
    bellmanFord: SearchBellmanFordOptions => SearchBellmanFordResult,
    betweennessCentrality: SearchBetweennessOptions => SearchBetweennessResult,
    bfs: SearchFirstOptions => SearchFirstResult,
    breadthFirstSearch: SearchFirstOptions => SearchFirstResult,
    closenessCentrality: SearchClosenessCentralityOptions => Double,
    closenessCentralityNormalized: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    degreeCentrality: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected,
    degreeCentralityNormalized: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected,
    depthFirstSearch: SearchFirstOptions => SearchFirstResult,
    dfs: SearchFirstOptions => SearchFirstResult,
    dijkstra: SearchDijkstraOptions => SearchDijkstraResult,
    floydWarshall: SearchFloydWarshallOptions => SearchFloydWarshallResult,
    hopcroftTarjanBiconnected: CallbackTo[Cut],
    hopcroftTarjanBiconnectedComponents: CallbackTo[Cut],
    htb: CallbackTo[Cut],
    htbc: CallbackTo[Cut],
    kargerStein: CallbackTo[Components],
    kruskal: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue,
    pageRank: SearchPageRankOptions => SearchPageRankResult,
    tarjanStronglyConnected: CallbackTo[ComponentsCut],
    tarjanStronglyConnectedComponents: CallbackTo[ComponentsCut],
    tsc: CallbackTo[ComponentsCut],
    tscc: CallbackTo[ComponentsCut]
  ): CollectionAlgorithms = {
    val __obj = js.Dynamic.literal(aStar = js.Any.fromFunction1(aStar), bellmanFord = js.Any.fromFunction1(bellmanFord), betweennessCentrality = js.Any.fromFunction1(betweennessCentrality), bfs = js.Any.fromFunction1(bfs), breadthFirstSearch = js.Any.fromFunction1(breadthFirstSearch), closenessCentrality = js.Any.fromFunction1(closenessCentrality), closenessCentralityNormalized = js.Any.fromFunction1(closenessCentralityNormalized), degreeCentrality = js.Any.fromFunction1(degreeCentrality), degreeCentralityNormalized = js.Any.fromFunction1(degreeCentralityNormalized), depthFirstSearch = js.Any.fromFunction1(depthFirstSearch), dfs = js.Any.fromFunction1(dfs), dijkstra = js.Any.fromFunction1(dijkstra), floydWarshall = js.Any.fromFunction1(floydWarshall), hopcroftTarjanBiconnected = hopcroftTarjanBiconnected.toJsFn, hopcroftTarjanBiconnectedComponents = hopcroftTarjanBiconnectedComponents.toJsFn, htb = htb.toJsFn, htbc = htbc.toJsFn, kargerStein = kargerStein.toJsFn, kruskal = js.Any.fromFunction1(kruskal), pageRank = js.Any.fromFunction1(pageRank), tarjanStronglyConnected = tarjanStronglyConnected.toJsFn, tarjanStronglyConnectedComponents = tarjanStronglyConnectedComponents.toJsFn, tsc = tsc.toJsFn, tscc = tscc.toJsFn)
    __obj.asInstanceOf[CollectionAlgorithms]
  }
  
  extension [Self <: CollectionAlgorithms](x: Self) {
    
    inline def setAStar(value: SearchAStarOptions => SearchAStarResult): Self = StObject.set(x, "aStar", js.Any.fromFunction1(value))
    
    inline def setBellmanFord(value: SearchBellmanFordOptions => SearchBellmanFordResult): Self = StObject.set(x, "bellmanFord", js.Any.fromFunction1(value))
    
    inline def setBetweennessCentrality(value: SearchBetweennessOptions => SearchBetweennessResult): Self = StObject.set(x, "betweennessCentrality", js.Any.fromFunction1(value))
    
    inline def setBfs(value: SearchFirstOptions => SearchFirstResult): Self = StObject.set(x, "bfs", js.Any.fromFunction1(value))
    
    inline def setBreadthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = StObject.set(x, "breadthFirstSearch", js.Any.fromFunction1(value))
    
    inline def setClosenessCentrality(value: SearchClosenessCentralityOptions => Double): Self = StObject.set(x, "closenessCentrality", js.Any.fromFunction1(value))
    
    inline def setClosenessCentralityNormalized(
      value: SearchClosenessCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = StObject.set(x, "closenessCentralityNormalized", js.Any.fromFunction1(value))
    
    inline def setDegreeCentrality(
      value: SearchDegreeCentralityOptions => SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected
    ): Self = StObject.set(x, "degreeCentrality", js.Any.fromFunction1(value))
    
    inline def setDegreeCentralityNormalized(
      value: SearchDegreeCentralityNormalizedOptions => SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ): Self = StObject.set(x, "degreeCentralityNormalized", js.Any.fromFunction1(value))
    
    inline def setDepthFirstSearch(value: SearchFirstOptions => SearchFirstResult): Self = StObject.set(x, "depthFirstSearch", js.Any.fromFunction1(value))
    
    inline def setDfs(value: SearchFirstOptions => SearchFirstResult): Self = StObject.set(x, "dfs", js.Any.fromFunction1(value))
    
    inline def setDijkstra(value: SearchDijkstraOptions => SearchDijkstraResult): Self = StObject.set(x, "dijkstra", js.Any.fromFunction1(value))
    
    inline def setFloydWarshall(value: SearchFloydWarshallOptions => SearchFloydWarshallResult): Self = StObject.set(x, "floydWarshall", js.Any.fromFunction1(value))
    
    inline def setHopcroftTarjanBiconnected(value: CallbackTo[Cut]): Self = StObject.set(x, "hopcroftTarjanBiconnected", value.toJsFn)
    
    inline def setHopcroftTarjanBiconnectedComponents(value: CallbackTo[Cut]): Self = StObject.set(x, "hopcroftTarjanBiconnectedComponents", value.toJsFn)
    
    inline def setHtb(value: CallbackTo[Cut]): Self = StObject.set(x, "htb", value.toJsFn)
    
    inline def setHtbc(value: CallbackTo[Cut]): Self = StObject.set(x, "htbc", value.toJsFn)
    
    inline def setKargerStein(value: CallbackTo[Components]): Self = StObject.set(x, "kargerStein", value.toJsFn)
    
    inline def setKruskal(value: js.Function1[/* edge */ EdgeCollection, Double] => CollectionReturnValue): Self = StObject.set(x, "kruskal", js.Any.fromFunction1(value))
    
    inline def setPageRank(value: SearchPageRankOptions => SearchPageRankResult): Self = StObject.set(x, "pageRank", js.Any.fromFunction1(value))
    
    inline def setTarjanStronglyConnected(value: CallbackTo[ComponentsCut]): Self = StObject.set(x, "tarjanStronglyConnected", value.toJsFn)
    
    inline def setTarjanStronglyConnectedComponents(value: CallbackTo[ComponentsCut]): Self = StObject.set(x, "tarjanStronglyConnectedComponents", value.toJsFn)
    
    inline def setTsc(value: CallbackTo[ComponentsCut]): Self = StObject.set(x, "tsc", value.toJsFn)
    
    inline def setTscc(value: CallbackTo[ComponentsCut]): Self = StObject.set(x, "tscc", value.toJsFn)
  }
}
