package typingsJapgolly.typedoc.distLibUtilsJsxDotelementsMod

import typingsJapgolly.typedoc.typedocStrings.`no-referrer-when-downgrade`
import typingsJapgolly.typedoc.typedocStrings.`no-referrer`
import typingsJapgolly.typedoc.typedocStrings.`origin-when-cross-origin`
import typingsJapgolly.typedoc.typedocStrings.`same-origin`
import typingsJapgolly.typedoc.typedocStrings.`strict-origin-when-cross-origin`
import typingsJapgolly.typedoc.typedocStrings.`strict-origin`
import typingsJapgolly.typedoc.typedocStrings.`unsafe-url`
import typingsJapgolly.typedoc.typedocStrings.`use-credentials`
import typingsJapgolly.typedoc.typedocStrings.anonymous
import typingsJapgolly.typedoc.typedocStrings.async
import typingsJapgolly.typedoc.typedocStrings.auto
import typingsJapgolly.typedoc.typedocStrings.origin
import typingsJapgolly.typedoc.typedocStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxImgElementProps
  extends StObject
     with JsxHtmlGlobalProps {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials`] = js.undefined
  
  var decoding: js.UndefOr[async | sync | auto] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var isMap: js.UndefOr[Boolean] = js.undefined
  
  var referrerPolicy: js.UndefOr[
    `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
  ] = js.undefined
  
  var sizes: js.UndefOr[String] = js.undefined
  
  var src: String
  
  var srcset: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object JsxImgElementProps {
  
  inline def apply(src: String): JsxImgElementProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxImgElementProps]
  }
  
  extension [Self <: JsxImgElementProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDecoding(value: async | sync | auto): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsMap(value: Boolean): Self = StObject.set(x, "isMap", value.asInstanceOf[js.Any])
    
    inline def setIsMapUndefined: Self = StObject.set(x, "isMap", js.undefined)
    
    inline def setReferrerPolicy(
      value: `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcset(value: String): Self = StObject.set(x, "srcset", value.asInstanceOf[js.Any])
    
    inline def setSrcsetUndefined: Self = StObject.set(x, "srcset", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
