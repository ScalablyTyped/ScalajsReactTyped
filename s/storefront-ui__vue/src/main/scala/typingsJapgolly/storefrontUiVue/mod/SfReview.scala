package typingsJapgolly.storefrontUiVue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SfReview extends Shortcut {
  
  @JSImport("@storefront-ui/vue", "SfReview")
  @js.native
  val ^ : Constructor = js.native
  
  trait Computed extends StObject {
    
    var buttonText: String
    
    var finalMessage: String
    
    var showButton: Boolean
  }
  object Computed {
    
    inline def apply(buttonText: String, finalMessage: String, showButton: Boolean): Computed = {
      val __obj = js.Dynamic.literal(buttonText = buttonText.asInstanceOf[js.Any], finalMessage = finalMessage.asInstanceOf[js.Any], showButton = showButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computed]
    }
    
    extension [Self <: Computed](x: Self) {
      
      inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setFinalMessage(value: String): Self = StObject.set(x, "finalMessage", value.asInstanceOf[js.Any])
      
      inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
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
    
    var isOpen: Boolean
  }
  object Data {
    
    inline def apply(isOpen: Boolean): Data = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Methods extends StObject {
    
    def toggleMessage(): Unit
  }
  object Methods {
    
    inline def apply(toggleMessage: Callback): Methods = {
      val __obj = js.Dynamic.literal(toggleMessage = toggleMessage.toJsFn)
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setToggleMessage(value: Callback): Self = StObject.set(x, "toggleMessage", value.toJsFn)
    }
  }
  
  trait Props extends StObject {
    
    var author: String
    
    var charLimit: Double | String
    
    var date: String
    
    var hideFullText: String
    
    var maxRating: Double | String
    
    var message: String
    
    var rating: Double | String | Boolean
    
    var readMoreText: String
  }
  object Props {
    
    inline def apply(
      author: String,
      charLimit: Double | String,
      date: String,
      hideFullText: String,
      maxRating: Double | String,
      message: String,
      rating: Double | String | Boolean,
      readMoreText: String
    ): Props = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], charLimit = charLimit.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], hideFullText = hideFullText.asInstanceOf[js.Any], maxRating = maxRating.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], readMoreText = readMoreText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setCharLimit(value: Double | String): Self = StObject.set(x, "charLimit", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setHideFullText(value: String): Self = StObject.set(x, "hideFullText", value.asInstanceOf[js.Any])
      
      inline def setMaxRating(value: Double | String): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRating(value: Double | String | Boolean): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setReadMoreText(value: String): Self = StObject.set(x, "readMoreText", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Constructor
  
  /* This means you don't have to write `^`, but can instead just say `SfReview.foo` */
  override def _to: Constructor = ^
}
