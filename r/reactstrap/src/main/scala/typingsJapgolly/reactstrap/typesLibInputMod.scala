package typingsJapgolly.reactstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactstrap.reactstrapStrings.lg
import typingsJapgolly.reactstrap.reactstrapStrings.sm
import typingsJapgolly.reactstrap.typesLibUtilsMod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibInputMod {
  
  @JSImport("reactstrap/types/lib/Input", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputProps, js.Object, Any]
  
  type Input = japgolly.scalajs.react.facade.React.Component[InputProps & js.Object, js.Object]
  
  trait InputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement]
       with /* key */ StringDictionary[Any] {
    
    var addon: js.UndefOr[Boolean] = js.undefined
    
    var bsSize: js.UndefOr[lg | sm] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var plaintext: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    @JSName("type")
    var type_InputProps: js.UndefOr[InputType] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setAddon(value: Boolean): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      inline def setBsSize(value: lg | sm): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: (HTMLInputElement | HTMLTextAreaElement) | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: (HTMLInputElement | HTMLTextAreaElement) | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: InputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactstrap.reactstrapStrings.text
    - typingsJapgolly.reactstrap.reactstrapStrings.email
    - typingsJapgolly.reactstrap.reactstrapStrings.select
    - typingsJapgolly.reactstrap.reactstrapStrings.file
    - typingsJapgolly.reactstrap.reactstrapStrings.radio
    - typingsJapgolly.reactstrap.reactstrapStrings.checkbox
    - typingsJapgolly.reactstrap.reactstrapStrings.switch
    - typingsJapgolly.reactstrap.reactstrapStrings.textarea
    - typingsJapgolly.reactstrap.reactstrapStrings.button
    - typingsJapgolly.reactstrap.reactstrapStrings.reset
    - typingsJapgolly.reactstrap.reactstrapStrings.submit
    - typingsJapgolly.reactstrap.reactstrapStrings.date
    - typingsJapgolly.reactstrap.reactstrapStrings.`datetime-local`
    - typingsJapgolly.reactstrap.reactstrapStrings.hidden
    - typingsJapgolly.reactstrap.reactstrapStrings.image
    - typingsJapgolly.reactstrap.reactstrapStrings.month
    - typingsJapgolly.reactstrap.reactstrapStrings.number
    - typingsJapgolly.reactstrap.reactstrapStrings.range
    - typingsJapgolly.reactstrap.reactstrapStrings.search
    - typingsJapgolly.reactstrap.reactstrapStrings.tel
    - typingsJapgolly.reactstrap.reactstrapStrings.url
    - typingsJapgolly.reactstrap.reactstrapStrings.week
    - typingsJapgolly.reactstrap.reactstrapStrings.password
    - typingsJapgolly.reactstrap.reactstrapStrings.datetime
    - typingsJapgolly.reactstrap.reactstrapStrings.time
    - typingsJapgolly.reactstrap.reactstrapStrings.color
  */
  trait InputType extends StObject
  object InputType {
    
    inline def button: typingsJapgolly.reactstrap.reactstrapStrings.button = "button".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.button]
    
    inline def checkbox: typingsJapgolly.reactstrap.reactstrapStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.checkbox]
    
    inline def color: typingsJapgolly.reactstrap.reactstrapStrings.color = "color".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.color]
    
    inline def date: typingsJapgolly.reactstrap.reactstrapStrings.date = "date".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.date]
    
    inline def datetime: typingsJapgolly.reactstrap.reactstrapStrings.datetime = "datetime".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.datetime]
    
    inline def `datetime-local`: typingsJapgolly.reactstrap.reactstrapStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.`datetime-local`]
    
    inline def email: typingsJapgolly.reactstrap.reactstrapStrings.email = "email".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.email]
    
    inline def file: typingsJapgolly.reactstrap.reactstrapStrings.file = "file".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.file]
    
    inline def hidden: typingsJapgolly.reactstrap.reactstrapStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.hidden]
    
    inline def image: typingsJapgolly.reactstrap.reactstrapStrings.image = "image".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.image]
    
    inline def month: typingsJapgolly.reactstrap.reactstrapStrings.month = "month".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.month]
    
    inline def number: typingsJapgolly.reactstrap.reactstrapStrings.number = "number".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.number]
    
    inline def password: typingsJapgolly.reactstrap.reactstrapStrings.password = "password".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.password]
    
    inline def radio: typingsJapgolly.reactstrap.reactstrapStrings.radio = "radio".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.radio]
    
    inline def range: typingsJapgolly.reactstrap.reactstrapStrings.range = "range".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.range]
    
    inline def reset: typingsJapgolly.reactstrap.reactstrapStrings.reset = "reset".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.reset]
    
    inline def search: typingsJapgolly.reactstrap.reactstrapStrings.search = "search".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.search]
    
    inline def select: typingsJapgolly.reactstrap.reactstrapStrings.select = "select".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.select]
    
    inline def submit: typingsJapgolly.reactstrap.reactstrapStrings.submit = "submit".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.submit]
    
    inline def switch: typingsJapgolly.reactstrap.reactstrapStrings.switch = "switch".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.switch]
    
    inline def tel: typingsJapgolly.reactstrap.reactstrapStrings.tel = "tel".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.tel]
    
    inline def text: typingsJapgolly.reactstrap.reactstrapStrings.text = "text".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.text]
    
    inline def textarea: typingsJapgolly.reactstrap.reactstrapStrings.textarea = "textarea".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.textarea]
    
    inline def time: typingsJapgolly.reactstrap.reactstrapStrings.time = "time".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.time]
    
    inline def url: typingsJapgolly.reactstrap.reactstrapStrings.url = "url".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.url]
    
    inline def week: typingsJapgolly.reactstrap.reactstrapStrings.week = "week".asInstanceOf[typingsJapgolly.reactstrap.reactstrapStrings.week]
  }
}
