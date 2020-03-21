package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cytoscape.AnonComponents
import typingsJapgolly.cytoscape.AnonComponentsCut
import typingsJapgolly.cytoscape.AnonCut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#eles.closenessCentralityNormalized
  * trivial
  */
trait CollectionAlgorithms extends js.Object {
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
  def hopcroftTarjanBiconnected(): AnonCut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def hopcroftTarjanBiconnectedComponents(): AnonCut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htb(): AnonCut
  /**
    * Finds the biconnected components in an undirected graph,
    * as well as their respective cut vertices, using an algorithm due to Hopcroft and Tarjan.
    * http://js.cytoscape.org/#eles.hopcroftTarjanBiconnected
    */
  def htbc(): AnonCut
  /**
    * Finds the minimum cut in a graph using the Karger-Stein algorithm.
    * The optimal result is found with a high probability, but without guarantee.
    * http://js.cytoscape.org/#eles.kargerStein
    */
  def kargerStein(): AnonComponents
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
  def tarjanStronglyConnected(): AnonComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tarjanStronglyConnectedComponents(): AnonComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tsc(): AnonComponentsCut
  /**
    * Finds the strongly connected components of a directed graph using Tarjan's algorithm.
    * http://js.cytoscape.org/#eles.tarjanStronglyConnected
    */
  def tscc(): AnonComponentsCut
}

object CollectionAlgorithms {
  @scala.inline
  def apply(
    aStar: SearchAStarOptions => CallbackTo[SearchAStarResult],
    bellmanFord: SearchBellmanFordOptions => CallbackTo[SearchBellmanFordResult],
    betweennessCentrality: SearchBetweennessOptions => CallbackTo[SearchBetweennessResult],
    bfs: SearchFirstOptions => CallbackTo[SearchFirstResult],
    breadthFirstSearch: SearchFirstOptions => CallbackTo[SearchFirstResult],
    closenessCentrality: SearchClosenessCentralityOptions => CallbackTo[Double],
    closenessCentralityNormalized: SearchClosenessCentralityNormalizedOptions => CallbackTo[
      SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ],
    degreeCentrality: SearchDegreeCentralityOptions => CallbackTo[SearchDegreeCentralityResultDirected | SearchDegreeCentralityResultUndirected],
    degreeCentralityNormalized: SearchDegreeCentralityNormalizedOptions => CallbackTo[
      SearchDegreeCentralityNormalizedResultDirected | SearchDegreeCentralityNormalizedResultUndirected
    ],
    depthFirstSearch: SearchFirstOptions => CallbackTo[SearchFirstResult],
    dfs: SearchFirstOptions => CallbackTo[SearchFirstResult],
    dijkstra: SearchDijkstraOptions => CallbackTo[SearchDijkstraResult],
    floydWarshall: SearchFloydWarshallOptions => CallbackTo[SearchFloydWarshallResult],
    hopcroftTarjanBiconnected: CallbackTo[AnonCut],
    hopcroftTarjanBiconnectedComponents: CallbackTo[AnonCut],
    htb: CallbackTo[AnonCut],
    htbc: CallbackTo[AnonCut],
    kargerStein: CallbackTo[AnonComponents],
    kruskal: js.Function1[/* edge */ EdgeCollection, Double] => CallbackTo[CollectionReturnValue],
    pageRank: SearchPageRankOptions => CallbackTo[SearchPageRankResult],
    tarjanStronglyConnected: CallbackTo[AnonComponentsCut],
    tarjanStronglyConnectedComponents: CallbackTo[AnonComponentsCut],
    tsc: CallbackTo[AnonComponentsCut],
    tscc: CallbackTo[AnonComponentsCut]
  ): CollectionAlgorithms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aStar")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchAStarOptions) => aStar(t0).runNow()))
    __obj.updateDynamic("bellmanFord")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchBellmanFordOptions) => bellmanFord(t0).runNow()))
    __obj.updateDynamic("betweennessCentrality")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchBetweennessOptions) => betweennessCentrality(t0).runNow()))
    __obj.updateDynamic("bfs")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchFirstOptions) => bfs(t0).runNow()))
    __obj.updateDynamic("breadthFirstSearch")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchFirstOptions) => breadthFirstSearch(t0).runNow()))
    __obj.updateDynamic("closenessCentrality")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchClosenessCentralityOptions) => closenessCentrality(t0).runNow()))
    __obj.updateDynamic("closenessCentralityNormalized")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchClosenessCentralityNormalizedOptions) => closenessCentralityNormalized(t0).runNow()))
    __obj.updateDynamic("degreeCentrality")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchDegreeCentralityOptions) => degreeCentrality(t0).runNow()))
    __obj.updateDynamic("degreeCentralityNormalized")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchDegreeCentralityNormalizedOptions) => degreeCentralityNormalized(t0).runNow()))
    __obj.updateDynamic("depthFirstSearch")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchFirstOptions) => depthFirstSearch(t0).runNow()))
    __obj.updateDynamic("dfs")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchFirstOptions) => dfs(t0).runNow()))
    __obj.updateDynamic("dijkstra")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchDijkstraOptions) => dijkstra(t0).runNow()))
    __obj.updateDynamic("floydWarshall")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchFloydWarshallOptions) => floydWarshall(t0).runNow()))
    __obj.updateDynamic("hopcroftTarjanBiconnected")(hopcroftTarjanBiconnected.toJsFn)
    __obj.updateDynamic("hopcroftTarjanBiconnectedComponents")(hopcroftTarjanBiconnectedComponents.toJsFn)
    __obj.updateDynamic("htb")(htb.toJsFn)
    __obj.updateDynamic("htbc")(htbc.toJsFn)
    __obj.updateDynamic("kargerStein")(kargerStein.toJsFn)
    __obj.updateDynamic("kruskal")(js.Any.fromFunction1((t0: js.Function1[/* edge */ typingsJapgolly.cytoscape.mod.EdgeCollection, scala.Double]) => kruskal(t0).runNow()))
    __obj.updateDynamic("pageRank")(js.Any.fromFunction1((t0: typingsJapgolly.cytoscape.mod.SearchPageRankOptions) => pageRank(t0).runNow()))
    __obj.updateDynamic("tarjanStronglyConnected")(tarjanStronglyConnected.toJsFn)
    __obj.updateDynamic("tarjanStronglyConnectedComponents")(tarjanStronglyConnectedComponents.toJsFn)
    __obj.updateDynamic("tsc")(tsc.toJsFn)
    __obj.updateDynamic("tscc")(tscc.toJsFn)
    __obj.asInstanceOf[CollectionAlgorithms]
  }
}

