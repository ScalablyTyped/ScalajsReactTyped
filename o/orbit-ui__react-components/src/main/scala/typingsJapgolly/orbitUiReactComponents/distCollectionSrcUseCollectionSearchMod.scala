package typingsJapgolly.orbitUiReactComponents

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.orbitUiReactComponents.distCollectionSrcUseCollectionMod.CollectionNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCollectionSrcUseCollectionSearchMod {
  
  @JSImport("@orbit-ui/react-components/dist/collection/src/useCollectionSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCollectionSearch(children: Node, hasOnSearch: UseCollectionSearchOptions): js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[Element], /* query */ String, Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCollectionSearch")(children.asInstanceOf[js.Any], hasOnSearch.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.Array[CollectionNode], 
    js.Function2[/* event */ ReactEventFrom[Element], /* query */ String, Unit]
  ]]
  
  trait UseCollectionSearchOptions extends StObject {
    
    var onSearch: js.UndefOr[js.Function2[/* event */ ReactEventFrom[Element], /* query */ String, Unit]] = js.undefined
  }
  object UseCollectionSearchOptions {
    
    inline def apply(): UseCollectionSearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseCollectionSearchOptions]
    }
    
    extension [Self <: UseCollectionSearchOptions](x: Self) {
      
      inline def setOnSearch(value: (/* event */ ReactEventFrom[Element], /* query */ String) => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* query */ String) => (value(t0, t1)).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
}
