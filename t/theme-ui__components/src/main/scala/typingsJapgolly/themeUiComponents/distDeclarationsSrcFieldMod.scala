package typingsJapgolly.themeUiComponents

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.themeUiComponents.anon.As
import typingsJapgolly.themeUiComponents.distDeclarationsSrcInputMod.InputProps
import typingsJapgolly.themeUiComponents.distDeclarationsSrcUtilMod.MarginProps
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.as
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.label
import typingsJapgolly.themeUiComponents.themeUiComponentsStrings.name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcFieldMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Field", "Field")
  @js.native
  val Field: typingsJapgolly.themeUiComponents.distDeclarationsSrcFieldMod.Field = js.native
  type Field = js.Function1[/* props */ FieldProps[ComponentType[InputProps]], Element]
  
  trait FieldOwnProps
    extends StObject
       with MarginProps {
    
    /**
      * Text for Label component
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Used for the for, id, and name attributes
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object FieldOwnProps {
    
    inline def apply(): FieldOwnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldOwnProps]
    }
    
    extension [Self <: FieldOwnProps](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type FieldProps[T /* <: ElementType */] = FieldOwnProps & (Omit[ComponentPropsWithRef[T], as | label | name]) & As[T]
}
