package typingsJapgolly.hapiTopo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/topo", "Sorter")
  @js.native
  open class Sorter[T] () extends StObject {
    
    /**
      * Adds a node or list of nodes to be added and topologically sorted
      * 
      * @param nodes - A mixed value or array of mixed values to be added as nodes to the topologically sorted list.
      * @param options - Optional sorting information about the nodes.
      * 
      * @returns Returns an array of the topologically sorted nodes.
      */
    def add(nodes: T): js.Array[T] = js.native
    def add(nodes: T, options: Options): js.Array[T] = js.native
    def add(nodes: js.Array[T]): js.Array[T] = js.native
    def add(nodes: js.Array[T], options: Options): js.Array[T] = js.native
    
    def merge(others: js.Array[Sorter[T]]): js.Array[T] = js.native
    /**
      * Merges another Sorter object into the current object.
      * 
      * @param others - The other object or array of objects to be merged into the current one.
      * 
      * @returns Returns an array of the topologically sorted nodes.
      */
    def merge(others: Sorter[T]): js.Array[T] = js.native
    
    /**
      * An array of the topologically sorted nodes. This list is renewed upon each call to topo.add().
      */
    var nodes: js.Array[T] = js.native
    
    /**
      * Sorts the nodes array (only required if the manual option is used when adding items)
      */
    def sort(): js.Array[T] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * The group or groups the added items must come after
      */
    val after: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The group or groups the added items must come before
      */
    val before: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The sorting group the added items belong to
      */
    val group: js.UndefOr[String] = js.undefined
    
    /**
      * If true, the array is not sorted automatically until sort() is called
      */
    val manual: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A number used to sort items with equal before/after requirements
      */
    val sort: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAfter(value: String | js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setSort(value: Double): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
}
