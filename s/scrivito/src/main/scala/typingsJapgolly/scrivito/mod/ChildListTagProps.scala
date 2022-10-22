package typingsJapgolly.scrivito.mod

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildListTagProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var parent: js.UndefOr[Obj] = js.undefined
  
  var renderChild: js.UndefOr[js.Function1[/* child */ Obj, Element]] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
}
object ChildListTagProps {
  
  inline def apply(): ChildListTagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildListTagProps]
  }
  
  extension [Self <: ChildListTagProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setParent(value: Obj): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRenderChild(value: /* child */ Obj => Element): Self = StObject.set(x, "renderChild", js.Any.fromFunction1(value))
    
    inline def setRenderChildUndefined: Self = StObject.set(x, "renderChild", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
