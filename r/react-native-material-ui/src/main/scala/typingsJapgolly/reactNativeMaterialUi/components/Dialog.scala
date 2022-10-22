package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeMaterialUi.anon.ActionsContainer
import typingsJapgolly.reactNativeMaterialUi.anon.ContentContainer
import typingsJapgolly.reactNativeMaterialUi.anon.TitleContainer
import typingsJapgolly.reactNativeMaterialUi.anon.`0`
import typingsJapgolly.reactNativeMaterialUi.mod.DialogActionsProps
import typingsJapgolly.reactNativeMaterialUi.mod.DialogContentProps
import typingsJapgolly.reactNativeMaterialUi.mod.DialogProps
import typingsJapgolly.reactNativeMaterialUi.mod.DialogTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dialog {
  
  inline def apply(children: Element | js.Array[Element]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
  
  object Actions {
    
    @JSImport("react-native-material-ui", "Dialog.Actions")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Actions] {
      
      inline def style(value: ActionsContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Actions.type): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Actions.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Actions.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DialogActionsProps): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Actions.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Actions.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Content {
    
    @JSImport("react-native-material-ui", "Dialog.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Content] {
      
      inline def style(value: ContentContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Content.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DialogContentProps): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Content.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("react-native-material-ui", "Dialog.Title")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Dialog.Title] {
      
      inline def style(value: TitleContainer): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Title.type): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Title.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Title.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: DialogTitleProps): typingsJapgolly.reactNativeMaterialUi.components.Dialog.Title.Builder = new typingsJapgolly.reactNativeMaterialUi.components.Dialog.Title.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-native-material-ui", "Dialog")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeMaterialUi.mod.Dialog] {
    
    inline def onPress(value: Callback): this.type = set("onPress", value.toJsFn)
    
    inline def style(value: `0`): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
