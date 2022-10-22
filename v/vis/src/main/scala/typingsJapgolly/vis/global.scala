package typingsJapgolly.vis

import org.scalajs.dom.HTMLElement
import typingsJapgolly.vis.mod.Data
import typingsJapgolly.vis.mod.DataGroup
import typingsJapgolly.vis.mod.DataGroupCollectionType
import typingsJapgolly.vis.mod.DataItem
import typingsJapgolly.vis.mod.DataItemCollectionType
import typingsJapgolly.vis.mod.DataSetOptions
import typingsJapgolly.vis.mod.Edge
import typingsJapgolly.vis.mod.Graph2dOptions
import typingsJapgolly.vis.mod.Node
import typingsJapgolly.vis.mod.Options
import typingsJapgolly.vis.mod.TimelineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object vis {
    
    @JSGlobal("vis.DataSet")
    @js.native
    /**
      * Creates an instance of DataSet.
      *
      * @param [data] An Array with items.
      * @param [options] DataSet options.
      */
    open class DataSet[T /* <: DataItem | DataGroup | Node | Edge */] ()
      extends typingsJapgolly.vis.mod.DataSet[T] {
      def this(data: js.Array[T]) = this()
      /**
        * Creates an instance of DataSet.
        *
        * @param [options] DataSet options.
        */
      def this(options: DataSetOptions) = this()
      def this(data: js.Array[T], options: DataSetOptions) = this()
      def this(data: Unit, options: DataSetOptions) = this()
    }
    
    @JSGlobal("vis.DataView")
    @js.native
    open class DataView[T /* <: DataItem | DataGroup */] protected ()
      extends typingsJapgolly.vis.mod.DataView[T] {
      def this(items: js.Array[T]) = this()
    }
    
    @JSGlobal("vis.Graph2d")
    @js.native
    open class Graph2d protected ()
      extends typingsJapgolly.vis.mod.Graph2d {
      def this(container: HTMLElement, items: DataItemCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, options: Graph2dOptions) = this()
      def this(
        container: HTMLElement,
        items: DataItemCollectionType,
        groups: DataGroupCollectionType,
        options: Graph2dOptions
      ) = this()
    }
    
    @JSGlobal("vis.Network")
    @js.native
    open class Network protected ()
      extends typingsJapgolly.vis.mod.Network {
      /**
        * Creates an instance of Network.
        *
        * @param container the HTML element representing the network container
        * @param data network data
        * @param [options] optional network options
        */
      def this(container: HTMLElement, data: Data) = this()
      def this(container: HTMLElement, data: Data, options: Options) = this()
    }
    
    @JSGlobal("vis.Timeline")
    @js.native
    open class Timeline protected ()
      extends typingsJapgolly.vis.mod.Timeline {
      def this(container: HTMLElement, items: DataItemCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, groups: DataGroupCollectionType) = this()
      def this(container: HTMLElement, items: DataItemCollectionType, options: TimelineOptions) = this()
      def this(
        container: HTMLElement,
        items: DataItemCollectionType,
        groups: DataGroupCollectionType,
        options: TimelineOptions
      ) = this()
    }
  }
}
