package typingsJapgolly.reactKawaii

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-kawaii", "Backpack")
  @js.native
  val Backpack: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Browser")
  @js.native
  val Browser: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Cat")
  @js.native
  val Cat: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Chocolate")
  @js.native
  val Chocolate: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "CreditCard")
  @js.native
  val CreditCard: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "File")
  @js.native
  val File: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Folder")
  @js.native
  val Folder: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Ghost")
  @js.native
  val Ghost: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "IceCream")
  @js.native
  val IceCream: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Mug")
  @js.native
  val Mug: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Planet")
  @js.native
  val Planet: ComponentType[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "SpeechBubble")
  @js.native
  val SpeechBubble: ComponentType[KawaiiProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.sad
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.shocked
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.happy
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.blissful
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.lovestruck
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.excited
    - typingsJapgolly.reactKawaii.reactKawaiiStrings.ko
  */
  trait KawaiiMood extends StObject
  object KawaiiMood {
    
    inline def blissful: typingsJapgolly.reactKawaii.reactKawaiiStrings.blissful = "blissful".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.blissful]
    
    inline def excited: typingsJapgolly.reactKawaii.reactKawaiiStrings.excited = "excited".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.excited]
    
    inline def happy: typingsJapgolly.reactKawaii.reactKawaiiStrings.happy = "happy".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.happy]
    
    inline def ko: typingsJapgolly.reactKawaii.reactKawaiiStrings.ko = "ko".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.ko]
    
    inline def lovestruck: typingsJapgolly.reactKawaii.reactKawaiiStrings.lovestruck = "lovestruck".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.lovestruck]
    
    inline def sad: typingsJapgolly.reactKawaii.reactKawaiiStrings.sad = "sad".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.sad]
    
    inline def shocked: typingsJapgolly.reactKawaii.reactKawaiiStrings.shocked = "shocked".asInstanceOf[typingsJapgolly.reactKawaii.reactKawaiiStrings.shocked]
  }
  
  trait KawaiiProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var mood: js.UndefOr[KawaiiMood] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object KawaiiProps {
    
    inline def apply(): KawaiiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KawaiiProps]
    }
    
    extension [Self <: KawaiiProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setMood(value: KawaiiMood): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
      
      inline def setMoodUndefined: Self = StObject.set(x, "mood", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
