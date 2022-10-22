package typingsJapgolly.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.arangodb.ArangoDB.Collection
import typingsJapgolly.arangodb.ArangoDB.Document
import typingsJapgolly.arangodb.ArangoDB.Edge
import typingsJapgolly.arangodb.generalGraphMod.Betweenness
import typingsJapgolly.arangodb.generalGraphMod.BetweennessOptions
import typingsJapgolly.arangodb.generalGraphMod.Closeness
import typingsJapgolly.arangodb.generalGraphMod.ClosenessOptions
import typingsJapgolly.arangodb.generalGraphMod.CommonNeighbors
import typingsJapgolly.arangodb.generalGraphMod.CommonProperties
import typingsJapgolly.arangodb.generalGraphMod.CommonPropertiesOptions
import typingsJapgolly.arangodb.generalGraphMod.ConnectingEdgesOptions
import typingsJapgolly.arangodb.generalGraphMod.CountCommonNeighbors
import typingsJapgolly.arangodb.generalGraphMod.CountCommonProperties
import typingsJapgolly.arangodb.generalGraphMod.DiameterOptions
import typingsJapgolly.arangodb.generalGraphMod.Distance
import typingsJapgolly.arangodb.generalGraphMod.Eccentricity
import typingsJapgolly.arangodb.generalGraphMod.EccentricityOptions
import typingsJapgolly.arangodb.generalGraphMod.EdgeDefinition
import typingsJapgolly.arangodb.generalGraphMod.Example
import typingsJapgolly.arangodb.generalGraphMod.NeighborsOptions
import typingsJapgolly.arangodb.generalGraphMod.Path
import typingsJapgolly.arangodb.generalGraphMod.PathsOptions
import typingsJapgolly.arangodb.generalGraphMod.RadiusOptions
import typingsJapgolly.arangodb.generalGraphMod.ShortestPath
import typingsJapgolly.arangodb.generalGraphMod.ShortestPathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arangodb.@arangodb/general-graph.Graph & {[key: string] : arangodb.ArangoDB.Collection<any> | undefined} */
@js.native
trait GraphkeystringCollectiona
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[Collection[Any]]] {
  
  def _absoluteBetweenness(vertexExample: Example): Betweenness = js.native
  def _absoluteBetweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  
  def _absoluteCloseness(vertexExample: Example): Closeness = js.native
  def _absoluteCloseness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  
  def _absoluteEccentricity(vertexExample: Example): Eccentricity = js.native
  def _absoluteEccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  
  def _addVertexCollection(orphanCollectionName: String): Unit = js.native
  def _addVertexCollection(orphanCollectionName: String, createCollection: Boolean): Unit = js.native
  
  def _betweenness(vertexExample: Example): Betweenness = js.native
  def _betweenness(vertexExample: Example, options: BetweennessOptions): Betweenness = js.native
  
  def _closeness(vertexExample: Example): Closeness = js.native
  def _closeness(vertexExample: Example, options: ClosenessOptions): Closeness = js.native
  
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: Unit,
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CommonNeighbors] = js.native
  def _commonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CommonNeighbors] = js.native
  
  def _commonProperties(vertexExample1: Example, vertex2Example: Example): js.Array[CommonProperties] = js.native
  def _commonProperties(vertexExample1: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CommonProperties] = js.native
  
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: Unit,
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(vertex1Example: Example, vertex2Example: Example, vertex1Options: NeighborsOptions): js.Array[CountCommonNeighbors] = js.native
  def _countCommonNeighbors(
    vertex1Example: Example,
    vertex2Example: Example,
    vertex1Options: NeighborsOptions,
    vertex2Options: NeighborsOptions
  ): js.Array[CountCommonNeighbors] = js.native
  
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example): js.Array[CountCommonProperties] = js.native
  def _countCommonProperties(vertex1Example: Example, vertex2Example: Example, options: CommonPropertiesOptions): js.Array[CountCommonProperties] = js.native
  
  def _deleteEdgeDefinition(edgeCollectionName: String): Unit = js.native
  def _deleteEdgeDefinition(edgeCollectionName: String, dropCollection: Boolean): Unit = js.native
  
  def _diameter(vertexExample: Example): Double = js.native
  def _diameter(vertexExample: Example, options: DiameterOptions): Double = js.native
  
  def _distanceTo(startVertexExample: Example, endVertexExample: Example): js.Array[Distance] = js.native
  def _distanceTo(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[Distance] = js.native
  
  def _eccentricity(vertexExample: Example): Eccentricity = js.native
  def _eccentricity(vertexExample: Example, options: EccentricityOptions): Eccentricity = js.native
  
  def _editEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  
  def _extendEdgeDefinitions(edgeDefinition: EdgeDefinition): Unit = js.native
  
  def _fromVertex(edgeId: String): Document[Any] = js.native
  
  def _getConnectingEdges(vertexExample1: Example, vertexExample2: Example, options: ConnectingEdgesOptions): Edge[Any] = js.native
  
  def _neighbors(vertexExample: Example): js.Array[String] = js.native
  def _neighbors(vertexExample: Example, options: NeighborsOptions): js.Array[String] = js.native
  
  def _orphanCollections(): js.Array[String] = js.native
  
  def _paths(): js.Array[Path[Any, Any, Any, scala.Nothing]] = js.native
  def _paths(options: PathsOptions): js.Array[Path[Any, Any, Any, scala.Nothing]] = js.native
  
  def _radius(vertexExample: Example): Double = js.native
  def _radius(vertexExample: Example, options: RadiusOptions): Double = js.native
  
  def _removeVertexCollection(orphanCollectionName: String): Unit = js.native
  def _removeVertexCollection(orphanCollectionName: String, dropCollection: Boolean): Unit = js.native
  
  def _shortestPath(startVertexExample: Example, endVertexExample: Example): js.Array[ShortestPath[Any]] = js.native
  def _shortestPath(startVertexExample: Example, endVertexExample: Example, options: ShortestPathOptions): js.Array[ShortestPath[Any]] = js.native
  
  def _toVertex(edgeId: String): Document[Any] = js.native
}
