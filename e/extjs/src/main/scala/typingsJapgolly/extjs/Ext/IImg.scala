package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImg
  extends StObject
     with IComponent {
  
  /** [Config Option] (String) */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (Number/String) */
  var glyph: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var imgCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IImg: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Updates the src of the image
    * @param src String
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object IImg {
  
  inline def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  
  extension [Self <: IImg](x: Self) {
    
    inline def setAlt(value: java.lang.String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setGlyph(value: Any): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
    
    inline def setGlyphUndefined: Self = StObject.set(x, "glyph", js.undefined)
    
    inline def setImgCls(value: java.lang.String): Self = StObject.set(x, "imgCls", value.asInstanceOf[js.Any])
    
    inline def setImgClsUndefined: Self = StObject.set(x, "imgCls", js.undefined)
    
    inline def setOnRender(value: Callback): Self = StObject.set(x, "onRender", value.toJsFn)
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
    
    inline def setSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setSrc", js.Any.fromFunction1((t0: /* src */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
    
    inline def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
    
    inline def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
