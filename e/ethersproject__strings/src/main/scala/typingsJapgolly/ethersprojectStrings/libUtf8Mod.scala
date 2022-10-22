package typingsJapgolly.ethersprojectStrings

import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtf8Mod {
  
  @JSImport("@ethersproject/strings/lib/utf8", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait UnicodeNormalizationForm extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "UnicodeNormalizationForm")
  @js.native
  object UnicodeNormalizationForm extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UnicodeNormalizationForm & String] = js.native
    
    @js.native
    sealed trait NFC
      extends StObject
         with UnicodeNormalizationForm
    /* "NFC" */ val NFC: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFC & String = js.native
    
    @js.native
    sealed trait NFD
      extends StObject
         with UnicodeNormalizationForm
    /* "NFD" */ val NFD: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFD & String = js.native
    
    @js.native
    sealed trait NFKC
      extends StObject
         with UnicodeNormalizationForm
    /* "NFKC" */ val NFKC: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFKC & String = js.native
    
    @js.native
    sealed trait NFKD
      extends StObject
         with UnicodeNormalizationForm
    /* "NFKD" */ val NFKD: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.NFKD & String = js.native
    
    @js.native
    sealed trait current
      extends StObject
         with UnicodeNormalizationForm
    /* "" */ val current: typingsJapgolly.ethersprojectStrings.libUtf8Mod.UnicodeNormalizationForm.current & String = js.native
  }
  
  @js.native
  sealed trait Utf8ErrorReason extends StObject
  @JSImport("@ethersproject/strings/lib/utf8", "Utf8ErrorReason")
  @js.native
  object Utf8ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Utf8ErrorReason & String] = js.native
    
    @js.native
    sealed trait BAD_PREFIX
      extends StObject
         with Utf8ErrorReason
    /* "bad codepoint prefix" */ val BAD_PREFIX: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.BAD_PREFIX & String = js.native
    
    @js.native
    sealed trait MISSING_CONTINUE
      extends StObject
         with Utf8ErrorReason
    /* "missing continuation byte" */ val MISSING_CONTINUE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.MISSING_CONTINUE & String = js.native
    
    @js.native
    sealed trait OUT_OF_RANGE
      extends StObject
         with Utf8ErrorReason
    /* "out of UTF-8 range" */ val OUT_OF_RANGE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OUT_OF_RANGE & String = js.native
    
    @js.native
    sealed trait OVERLONG
      extends StObject
         with Utf8ErrorReason
    /* "overlong representation" */ val OVERLONG: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OVERLONG & String = js.native
    
    @js.native
    sealed trait OVERRUN
      extends StObject
         with Utf8ErrorReason
    /* "string overrun" */ val OVERRUN: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.OVERRUN & String = js.native
    
    @js.native
    sealed trait UNEXPECTED_CONTINUE
      extends StObject
         with Utf8ErrorReason
    /* "unexpected continuation byte" */ val UNEXPECTED_CONTINUE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.UNEXPECTED_CONTINUE & String = js.native
    
    @js.native
    sealed trait UTF16_SURROGATE
      extends StObject
         with Utf8ErrorReason
    /* "UTF-16 surrogate" */ val UTF16_SURROGATE: typingsJapgolly.ethersprojectStrings.libUtf8Mod.Utf8ErrorReason.UTF16_SURROGATE & String = js.native
  }
  
  inline def _toUtf8String(codePoints: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_toUtf8String")(codePoints.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toEscapedUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toEscapedUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_toEscapedUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUtf8Bytes(str: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def toUtf8Bytes(str: String, form: UnicodeNormalizationForm): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8Bytes")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def toUtf8CodePoints(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def toUtf8CodePoints(str: String, form: UnicodeNormalizationForm): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8CodePoints")(str.asInstanceOf[js.Any], form.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def toUtf8String(bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toUtf8String(bytes: BytesLike, onError: Utf8ErrorFunc): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toUtf8String")(bytes.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Utf8ErrorFunc = js.Function5[
    /* reason */ Utf8ErrorReason, 
    /* offset */ Double, 
    /* bytes */ ArrayLike[Double], 
    /* output */ js.Array[Double], 
    /* badCodepoint */ js.UndefOr[Double], 
    Double
  ]
}
