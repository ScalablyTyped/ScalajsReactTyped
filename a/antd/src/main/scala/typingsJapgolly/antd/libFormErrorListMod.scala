package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.libFormFormItemMod.ValidateStatus
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormErrorListMod {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasHelpHelpStatusErrorsWarningsRootClassNameFieldIdOnVisibleChanged: ErrorListProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasHelpHelpStatusErrorsWarningsRootClassNameFieldIdOnVisibleChanged.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ErrorListProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var errors: js.UndefOr[js.Array[Node]] = js.undefined
    
    var fieldId: js.UndefOr[String] = js.undefined
    
    var help: js.UndefOr[Node] = js.undefined
    
    var helpStatus: js.UndefOr[ValidateStatus] = js.undefined
    
    var onVisibleChanged: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var warnings: js.UndefOr[js.Array[Node]] = js.undefined
  }
  object ErrorListProps {
    
    inline def apply(): ErrorListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorListProps]
    }
    
    extension [Self <: ErrorListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setErrors(value: js.Array[Node]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: Node*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
      
      inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
      
      inline def setHelp(value: VdomNode): Self = StObject.set(x, "help", value.rawNode.asInstanceOf[js.Any])
      
      inline def setHelpNull: Self = StObject.set(x, "help", null)
      
      inline def setHelpStatus(value: ValidateStatus): Self = StObject.set(x, "helpStatus", value.asInstanceOf[js.Any])
      
      inline def setHelpStatusUndefined: Self = StObject.set(x, "helpStatus", js.undefined)
      
      inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      inline def setHelpVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "help", js.Array(value*))
      
      inline def setHelpVdomElement(value: VdomElement): Self = StObject.set(x, "help", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnVisibleChanged(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnVisibleChangedUndefined: Self = StObject.set(x, "onVisibleChanged", js.undefined)
      
      inline def setWarnings(value: js.Array[Node]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: Node*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
}
