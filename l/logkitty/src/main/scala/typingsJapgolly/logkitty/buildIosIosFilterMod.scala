package typingsJapgolly.logkitty

import japgolly.scalajs.react.Callback
import typingsJapgolly.logkitty.buildTypesMod.Entry
import typingsJapgolly.logkitty.buildTypesMod.IFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosIosFilterMod {
  
  @JSImport("logkitty/build/ios/IosFilter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IosFilter {
    def this(minPriority: Double) = this()
    
    /* private */ /* CompleteClass */
    var filter: Any = js.native
    
    /* private */ /* CompleteClass */
    override val minPriority: Any = js.native
    
    /* CompleteClass */
    override def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit = js.native
    
    /* CompleteClass */
    override def setFilterByTag(tags: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def shouldInclude(entry: Entry): Boolean = js.native
  }
  
  trait IosFilter
    extends StObject
       with IFilter {
    
    /* private */ var filter: Any
    
    /* private */ val minPriority: Any
    
    def setFilterByMatch(regexes: js.Array[js.RegExp]): Unit
    
    def setFilterByTag(tags: js.Array[String]): Unit
  }
  object IosFilter {
    
    inline def apply(
      filter: Any,
      minPriority: Any,
      setFilterByMatch: js.Array[js.RegExp] => Callback,
      setFilterByTag: js.Array[String] => Callback,
      shouldInclude: Entry => Boolean
    ): IosFilter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], minPriority = minPriority.asInstanceOf[js.Any], setFilterByMatch = js.Any.fromFunction1((t0: js.Array[js.RegExp]) => setFilterByMatch(t0).runNow()), setFilterByTag = js.Any.fromFunction1((t0: js.Array[String]) => setFilterByTag(t0).runNow()), shouldInclude = js.Any.fromFunction1(shouldInclude))
      __obj.asInstanceOf[IosFilter]
    }
    
    extension [Self <: IosFilter](x: Self) {
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setMinPriority(value: Any): Self = StObject.set(x, "minPriority", value.asInstanceOf[js.Any])
      
      inline def setSetFilterByMatch(value: js.Array[js.RegExp] => Callback): Self = StObject.set(x, "setFilterByMatch", js.Any.fromFunction1((t0: js.Array[js.RegExp]) => value(t0).runNow()))
      
      inline def setSetFilterByTag(value: js.Array[String] => Callback): Self = StObject.set(x, "setFilterByTag", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    }
  }
}
