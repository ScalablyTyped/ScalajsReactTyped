package typingsJapgolly.qrcodejs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.qrcodejs.qrcodejsInts.`0`
import typingsJapgolly.qrcodejs.qrcodejsInts.`1`
import typingsJapgolly.qrcodejs.qrcodejsInts.`2`
import typingsJapgolly.qrcodejs.qrcodejsInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object qrcodejsMod {
  
  @JSImport("qrcodejs/qrcodejs", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with QRCode {
    def this(el: String, vOption: typingsJapgolly.qrcodejs.qrcodejsMod.vOption) = this()
    /**
      * @param el target element or 'id' attribute of element.
      * @param vOption
      */
    def this(el: HTMLElement, vOption: typingsJapgolly.qrcodejs.qrcodejsMod.vOption) = this()
    
    /**
      * Clear the QRCode
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Make the QRCode
      * @param sText link data
      */
    /* CompleteClass */
    override def makeCode(sText: String): Unit = js.native
  }
  
  object CorrectLevel {
    
    @JSImport("qrcodejs/qrcodejs", "CorrectLevel")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("qrcodejs/qrcodejs", "CorrectLevel.H")
    @js.native
    def H: `2` = js.native
    inline def H_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("H")(x.asInstanceOf[js.Any])
    
    @JSImport("qrcodejs/qrcodejs", "CorrectLevel.L")
    @js.native
    def L: `1` = js.native
    inline def L_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("L")(x.asInstanceOf[js.Any])
    
    @JSImport("qrcodejs/qrcodejs", "CorrectLevel.M")
    @js.native
    def M: `0` = js.native
    inline def M_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("M")(x.asInstanceOf[js.Any])
    
    @JSImport("qrcodejs/qrcodejs", "CorrectLevel.Q")
    @js.native
    def Q: `3` = js.native
    inline def Q_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Q")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {  L :1,   M :0,   Q :3,   H :2}[keyof {  L :1,   M :0,   Q :3,   H :2}] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.qrcodejs.qrcodejsInts.`1`
    - typingsJapgolly.qrcodejs.qrcodejsInts.`0`
    - typingsJapgolly.qrcodejs.qrcodejsInts.`3`
    - typingsJapgolly.qrcodejs.qrcodejsInts.`2`
  */
  trait CorrectLevelType extends StObject
  object CorrectLevelType {
    
    inline def `0`: typingsJapgolly.qrcodejs.qrcodejsInts.`0` = 0.asInstanceOf[typingsJapgolly.qrcodejs.qrcodejsInts.`0`]
    
    inline def `1`: typingsJapgolly.qrcodejs.qrcodejsInts.`1` = 1.asInstanceOf[typingsJapgolly.qrcodejs.qrcodejsInts.`1`]
    
    inline def `2`: typingsJapgolly.qrcodejs.qrcodejsInts.`2` = 2.asInstanceOf[typingsJapgolly.qrcodejs.qrcodejsInts.`2`]
    
    inline def `3`: typingsJapgolly.qrcodejs.qrcodejsInts.`3` = 3.asInstanceOf[typingsJapgolly.qrcodejs.qrcodejsInts.`3`]
  }
  
  trait Options extends StObject {
    
    /** @default #000000 */
    var colorDark: js.UndefOr[String] = js.undefined
    
    /** @default #ffffff */
    var colorLight: js.UndefOr[String] = js.undefined
    
    /** @default CorrectLevel.H */
    var correctLevel: js.UndefOr[CorrectLevelType] = js.undefined
    
    /** @default 256 */
    var height: js.UndefOr[Double] = js.undefined
    
    /** QRCode link data  */
    var text: js.UndefOr[String] = js.undefined
    
    var useSVG: js.UndefOr[Boolean] = js.undefined
    
    /** @efault 256 */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setColorDark(value: String): Self = StObject.set(x, "colorDark", value.asInstanceOf[js.Any])
      
      inline def setColorDarkUndefined: Self = StObject.set(x, "colorDark", js.undefined)
      
      inline def setColorLight(value: String): Self = StObject.set(x, "colorLight", value.asInstanceOf[js.Any])
      
      inline def setColorLightUndefined: Self = StObject.set(x, "colorLight", js.undefined)
      
      inline def setCorrectLevel(value: CorrectLevelType): Self = StObject.set(x, "correctLevel", value.asInstanceOf[js.Any])
      
      inline def setCorrectLevelUndefined: Self = StObject.set(x, "correctLevel", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUseSVG(value: Boolean): Self = StObject.set(x, "useSVG", value.asInstanceOf[js.Any])
      
      inline def setUseSVGUndefined: Self = StObject.set(x, "useSVG", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait QRCode extends StObject {
    
    /**
      * Clear the QRCode
      */
    def clear(): Unit
    
    /**
      * Make the QRCode
      * @param sText link data
      */
    def makeCode(sText: String): Unit
  }
  object QRCode {
    
    inline def apply(clear: Callback, makeCode: String => Callback): QRCode = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, makeCode = js.Any.fromFunction1((t0: String) => makeCode(t0).runNow()))
      __obj.asInstanceOf[QRCode]
    }
    
    extension [Self <: QRCode](x: Self) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setMakeCode(value: String => Callback): Self = StObject.set(x, "makeCode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type vOption = String | Options
}
