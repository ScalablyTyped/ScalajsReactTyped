package typingsJapgolly.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * http://js.cytoscape.org/#collection/style
    */
  type ClassName = java.lang.String
  /** A space-separated list of class names */
  type ClassNames = java.lang.String
  /**
    * The output is a collection of node and edge elements OR single element.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cytoscape.mod.Collection[
  typingsJapgolly.cytoscape.mod.SingularElementReturnValue, 
  typingsJapgolly.cytoscape.mod.SingularElementArgument]
    - typingsJapgolly.cytoscape.mod.EdgeCollection
    - typingsJapgolly.cytoscape.mod.NodeCollection
    - typingsJapgolly.cytoscape.mod.SingularElementArgument
  */
  type CollectionArgument = typingsJapgolly.cytoscape.mod._CollectionArgument | (typingsJapgolly.cytoscape.mod.Collection[
    typingsJapgolly.cytoscape.mod.SingularElementReturnValue, 
    typingsJapgolly.cytoscape.mod.SingularElementArgument
  ])
  /**
    * Get a new collection, resulting from the collection without some specified elements.
    * http://js.cytoscape.org/#eles.difference
    * @param eles The elements that will not be in the resultant collection.
    *             Elements from the calling collection matching this selector will not be in the resultant collection.
    */
  type CollectionBuildingDifferenceFunc = js.Function1[
    /* eles */ typingsJapgolly.cytoscape.mod.CollectionArgument | typingsJapgolly.cytoscape.mod.Selector, 
    typingsJapgolly.cytoscape.mod.CollectionReturnValue
  ]
  /**
    * Get the elements in both this collection and another specified collection.
    * http://js.cytoscape.org/#eles.intersection
    * @param eles The elements to intersect with.
    *             A selector representing the elements to intersect with.
    *             All elements in the graph matching the selector are used as the passed collection.
    */
  type CollectionBuildingIntersectionFunc = js.Function1[
    /* eles */ typingsJapgolly.cytoscape.mod.CollectionArgument | typingsJapgolly.cytoscape.mod.Selector, 
    typingsJapgolly.cytoscape.mod.CollectionReturnValue
  ]
  /**
    * http://js.cytoscape.org/#collection/building--filtering
    */
  /**
    * Get a new collection, resulting from adding the collection with another one
    *
    * @param eles The elements or array of elements to add or elements in the graph matching the selector.
    * http://js.cytoscape.org/#eles.union
    */
  type CollectionBuildingUnionFunc = js.Function1[
    /* eles */ typingsJapgolly.cytoscape.mod.CollectionArgument | js.Array[typingsJapgolly.cytoscape.mod.CollectionArgument] | typingsJapgolly.cytoscape.mod.Selector, 
    typingsJapgolly.cytoscape.mod.CollectionReturnValue
  ]
  type CollectionReturnValue = (typingsJapgolly.cytoscape.mod.Collection[
    typingsJapgolly.cytoscape.mod.SingularElementReturnValue, 
    typingsJapgolly.cytoscape.mod.SingularElementArgument
  ]) with typingsJapgolly.cytoscape.mod.EdgeCollection with typingsJapgolly.cytoscape.mod.NodeCollection with typingsJapgolly.cytoscape.mod.SingularElementReturnValue
  /**
    * Get the elements that are in the calling collection or the passed collection but not in both.
    * http://js.cytoscape.org/#eles.symmetricDifference
    * @param eles The elements to apply the symmetric difference with.
    *             A selector representing the elements to apply the symmetric difference with.
    *             All elements in the graph matching the selector are used as the passed collection.
    */
  type CollectionSymmetricDifferenceFunc = js.Function1[
    /* eles */ typingsJapgolly.cytoscape.mod.CollectionArgument | typingsJapgolly.cytoscape.mod.Selector, 
    typingsJapgolly.cytoscape.mod.CollectionReturnValue
  ]
  type CssStyleDeclaration = js.Any
  type ElementCollectionFunction = js.Function3[
    /* ele */ typingsJapgolly.cytoscape.mod.NodeSingular, 
    /* ix */ scala.Double, 
    /* eles */ typingsJapgolly.cytoscape.mod.CollectionArgument, 
    typingsJapgolly.cytoscape.mod.Position
  ]
  /**
    * @param ele The element being iterated over for which the function should return a position to set.
    * @param ix The index of the element when iterating over the elements in the collection.
    */
  type ElementPositionFunction = js.Function2[
    /* ele */ typingsJapgolly.cytoscape.mod.NodeSingular, 
    /* ix */ scala.Double, 
    typingsJapgolly.cytoscape.mod.Position
  ]
  type EventHandler = js.Function2[
    /* event */ typingsJapgolly.cytoscape.mod.EventObject, 
    /* extraParams */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * A space separated list of event names.
    * http://js.cytoscape.org/#cy.promiseOn
    */
  type EventNames = java.lang.String
  /**
    * Cytoscape extension type
    * Definition of an extension would be in following form:
    * @example
    * declare module 'cytoscape-ext' {
    *  const ext: cytoscape.Ext;
    *  export = ext;
    * }
    */
  type Ext = js.Function1[
    /* cytoscape */ js.Function1[
      /* options */ js.UndefOr[typingsJapgolly.cytoscape.mod.CytoscapeOptions], 
      typingsJapgolly.cytoscape.mod.Core
    ], 
    scala.Unit
  ]
  type LayoutHandler = js.Function1[/* e */ typingsJapgolly.cytoscape.mod.LayoutEventObject, scala.Unit]
  /**
    * http://js.cytoscape.org/#collection/traversing
    */
  type MinumumSpanningTree = js.Any
  type NodePositionFunction = js.Function1[/* nodeid */ java.lang.String, typingsJapgolly.cytoscape.mod.Position]
  /**
    * http://js.cytoscape.org/#layouts/preset
    */
  type NodePositionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.cytoscape.mod.Position]
  /**
    * Usually temp or nonserialisable data can be stored.
    * http://js.cytoscape.org/#notation/elements-json
    * http://js.cytoscape.org/#cy.scratch
    * http://js.cytoscape.org/#ele.scratch
    */
  type Scratchpad = js.Any
  /**
    * The handler returns true when it finds the desired node, and it returns false to cancel the search.
    * v - The current node.
    * e - The edge connecting the previous node to the current node.
    * u - The previous node.
    * i - The index indicating this node is the ith visited node.
    * depth - How many edge hops away this node is from the root nodes.
    */
  type SearchVisitFunction = js.Function5[
    /* v */ typingsJapgolly.cytoscape.mod.NodeSingular, 
    /* e */ typingsJapgolly.cytoscape.mod.EdgeSingular, 
    /* u */ typingsJapgolly.cytoscape.mod.NodeSingular, 
    /* i */ scala.Double, 
    /* depth */ scala.Double, 
    scala.Boolean | scala.Unit
  ]
  /**
    * A selector functions similar to a CSS selector on DOM elements,
    * but selectors in Cytoscape.js instead work on
    * collections of graph elements.
    * Note that wherever a selector may be specified
    * as the argument to a function,
    * a eles.filter()-style filter function may be
    * used in place of the selector.
    *
    * See http://js.cytoscape.org/#selectors for
    * details about writing selectors.
    * Selectors are an island grammar.
    */
  type Selector = java.lang.String
  type SingularElementReturnValue = typingsJapgolly.cytoscape.mod.EdgeSingular with typingsJapgolly.cytoscape.mod.NodeSingular
  // function(a, b){ return a.data('weight') - b.data('weight') }
  type SortingFunction = js.Function2[
    /* a */ typingsJapgolly.cytoscape.mod.SortableNode, 
    /* b */ typingsJapgolly.cytoscape.mod.SortableNode, 
    scala.Double
  ]
  /**
    *
    * http://js.cytoscape.org/#collection/algorithms
    */
  type WeightFn = js.Function1[/* edge */ typingsJapgolly.cytoscape.mod.EdgeCollection, scala.Double]
  type ZoomOptions = typingsJapgolly.cytoscape.mod.ZoomOptionsLevel with (typingsJapgolly.cytoscape.mod.ZoomOptionsModel | typingsJapgolly.cytoscape.mod.ZoomOptionsRendered)
}
