package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfSelect extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfSelect")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var html: String
    
    var index: Double
    
    var isActive: Boolean
    
    var isSelected: Boolean
    
    var maxHeight: String
  }
  object Computed {
    
    inline def apply(html: String, index: Double, isActive: Boolean, isSelected: Boolean, maxHeight: String): Computed = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait Constructor extends StObject {
    
    var computed: Computed
    
    def data(): Data
    
    var methods: Methods
    
    var props: Props
  }
  object Constructor {
    
    inline def apply(computed: Computed, data: CallbackTo[Data], methods: Methods, props: Props): Constructor = {
      val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], data = data.toJsFn, methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constructor]
    }
    
    extension [Self <: Constructor](x: Self) {
      
      inline def setComputed(value: Computed): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
      
      inline def setData(value: CallbackTo[Data]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setMethods(value: Methods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: Props): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var focusedOption: String
    
    var indexes: js.Object
    
    var open: Boolean
    
    var optionHeight: Double
    
    var options: js.Array[Any]
  }
  object Data {
    
    inline def apply(
      focusedOption: String,
      indexes: js.Object,
      open: Boolean,
      optionHeight: Double,
      options: js.Array[Any]
    ): Data = {
      val __obj = js.Dynamic.literal(focusedOption = focusedOption.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], optionHeight = optionHeight.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setFocusedOption(value: String): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      inline def setIndexes(value: js.Object): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOptionHeight(value: Double): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait Methods extends StObject {
    
    def closeHandler(): Unit
    
    def enter(): Unit
    
    def move(payload: Double): Unit
    
    def openHandler(): Unit
    
    def toggle(event: MouseEvent): Unit
    
    def update(index: Double): Unit
  }
  object Methods {
    
    inline def apply(
      closeHandler: Callback,
      enter: Callback,
      move: Double => Callback,
      openHandler: Callback,
      toggle: MouseEvent => Callback,
      update: Double => Callback
    ): Methods = {
      val __obj = js.Dynamic.literal(closeHandler = closeHandler.toJsFn, enter = enter.toJsFn, move = js.Any.fromFunction1((t0: Double) => move(t0).runNow()), openHandler = openHandler.toJsFn, toggle = js.Any.fromFunction1((t0: MouseEvent) => toggle(t0).runNow()), update = js.Any.fromFunction1((t0: Double) => update(t0).runNow()))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCloseHandler(value: Callback): Self = StObject.set(x, "closeHandler", value.toJsFn)
      
      inline def setEnter(value: Callback): Self = StObject.set(x, "enter", value.toJsFn)
      
      inline def setMove(value: Double => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOpenHandler(value: Callback): Self = StObject.set(x, "openHandler", value.toJsFn)
      
      inline def setToggle(value: MouseEvent => Callback): Self = StObject.set(x, "toggle", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
      
      inline def setUpdate(value: Double => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    }
  }
  
  trait Props extends StObject {
    
    var disabled: Boolean
    
    var errorMessage: String
    
    var label: String
    
    var required: Boolean
    
    var selected: String | Double | js.Object
    
    var size: Double
    
    var valid: Boolean
  }
  object Props {
    
    inline def apply(
      disabled: Boolean,
      errorMessage: String,
      label: String,
      required: Boolean,
      selected: String | Double | js.Object,
      size: Double,
      valid: Boolean
    ): Props = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String | Double | js.Object): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfSelect.foo` */
  override def _to: Constructor = ^
}
