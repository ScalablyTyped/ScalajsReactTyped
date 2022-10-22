package typingsJapgolly.reactEditext.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactEditext.mod.ButtonsAlignment
import typingsJapgolly.reactEditext.mod.EdiTextProps
import typingsJapgolly.reactEditext.mod.EdiTextType
import typingsJapgolly.reactEditext.mod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEditext {
  
  inline def apply(onSave: (Any, js.UndefOr[InputProps]) => Any, value: String): Builder = {
    val __props = js.Dynamic.literal(onSave = js.Any.fromFunction2(onSave), value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EdiTextProps]))
  }
  
  @JSImport("react-editext", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def buttonsAlign(value: ButtonsAlignment): this.type = set("buttonsAlign", value.asInstanceOf[js.Any])
    
    inline def canEdit(value: Boolean | js.Function0[Boolean]): this.type = set("canEdit", value.asInstanceOf[js.Any])
    
    inline def canEditCallbackTo(value: CallbackTo[Boolean]): this.type = set("canEdit", value.toJsFn)
    
    inline def cancelButtonClassName(value: String): this.type = set("cancelButtonClassName", value.asInstanceOf[js.Any])
    
    inline def cancelButtonContent(value: Any): this.type = set("cancelButtonContent", value.asInstanceOf[js.Any])
    
    inline def cancelOnEscape(value: Boolean): this.type = set("cancelOnEscape", value.asInstanceOf[js.Any])
    
    inline def cancelOnUnfocus(value: Boolean): this.type = set("cancelOnUnfocus", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): this.type = set("containerProps", value.asInstanceOf[js.Any])
    
    inline def editButtonClassName(value: String): this.type = set("editButtonClassName", value.asInstanceOf[js.Any])
    
    inline def editButtonContent(value: Any): this.type = set("editButtonContent", value.asInstanceOf[js.Any])
    
    inline def editButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): this.type = set("editButtonProps", value.asInstanceOf[js.Any])
    
    inline def editContainerClassName(value: String): this.type = set("editContainerClassName", value.asInstanceOf[js.Any])
    
    inline def editOnViewClick(value: Boolean): this.type = set("editOnViewClick", value.asInstanceOf[js.Any])
    
    inline def editing(value: Boolean): this.type = set("editing", value.asInstanceOf[js.Any])
    
    inline def hideIcons(value: Boolean): this.type = set("hideIcons", value.asInstanceOf[js.Any])
    
    inline def hint(value: VdomNode): this.type = set("hint", value.rawNode.asInstanceOf[js.Any])
    
    inline def hintNull: this.type = set("hint", null)
    
    inline def hintVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("hint", js.Array(value*))
    
    inline def hintVdomElement(value: VdomElement): this.type = set("hint", value.rawElement.asInstanceOf[js.Any])
    
    inline def inputProps(value: InputProps): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    inline def mainContainerClassName(value: String): this.type = set("mainContainerClassName", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: (/* value */ Any, /* inputProps */ js.UndefOr[InputProps]) => Any): this.type = set("onCancel", js.Any.fromFunction2(value))
    
    inline def onEditingStart(value: (/* value */ Any, /* inputProps */ js.UndefOr[InputProps]) => Any): this.type = set("onEditingStart", js.Any.fromFunction2(value))
    
    inline def onValidationFail(value: /* repeated */ String => Any): this.type = set("onValidationFail", js.Any.fromFunction1(value))
    
    inline def renderValue(value: /* value */ Any => Any): this.type = set("renderValue", js.Any.fromFunction1(value))
    
    inline def saveButtonClassName(value: String): this.type = set("saveButtonClassName", value.asInstanceOf[js.Any])
    
    inline def saveButtonContent(value: Any): this.type = set("saveButtonContent", value.asInstanceOf[js.Any])
    
    inline def showButtonsOnHover(value: Boolean): this.type = set("showButtonsOnHover", value.asInstanceOf[js.Any])
    
    inline def startEditingOnEnter(value: Boolean): this.type = set("startEditingOnEnter", value.asInstanceOf[js.Any])
    
    inline def startEditingOnFocus(value: Boolean): this.type = set("startEditingOnFocus", value.asInstanceOf[js.Any])
    
    inline def submitOnEnter(value: Boolean): this.type = set("submitOnEnter", value.asInstanceOf[js.Any])
    
    inline def submitOnUnfocus(value: Boolean): this.type = set("submitOnUnfocus", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def `type`(value: EdiTextType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def validation(value: /* repeated */ String => Boolean | js.Promise[Boolean]): this.type = set("validation", js.Any.fromFunction1(value))
    
    inline def validationMessage(value: Any): this.type = set("validationMessage", value.asInstanceOf[js.Any])
    
    inline def viewContainerClassName(value: String): this.type = set("viewContainerClassName", value.asInstanceOf[js.Any])
    
    inline def viewProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): this.type = set("viewProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EdiTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
