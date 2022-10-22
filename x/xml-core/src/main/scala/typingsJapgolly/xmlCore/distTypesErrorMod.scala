package typingsJapgolly.xmlCore

import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesErrorMod {
  
  @js.native
  sealed trait XE extends StObject
  @JSImport("xml-core/dist/types/error", "XE")
  @js.native
  object XE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[XE & Double] = js.native
    
    @js.native
    sealed trait ALGORITHM_NOT_SUPPORTED
      extends StObject
         with XE
    /* 16 */ val ALGORITHM_NOT_SUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ALGORITHM_NOT_SUPPORTED & Double = js.native
    
    @js.native
    sealed trait ALGORITHM_WRONG_NAME
      extends StObject
         with XE
    /* 17 */ val ALGORITHM_WRONG_NAME: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ALGORITHM_WRONG_NAME & Double = js.native
    
    @js.native
    sealed trait ATTRIBUTE_MISSING
      extends StObject
         with XE
    /* 11 */ val ATTRIBUTE_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ATTRIBUTE_MISSING & Double = js.native
    
    @js.native
    sealed trait COLLECTION_LIMIT
      extends StObject
         with XE
    /* 4 */ val COLLECTION_LIMIT: typingsJapgolly.xmlCore.distTypesErrorMod.XE.COLLECTION_LIMIT & Double = js.native
    
    @js.native
    sealed trait CONTENT_MISSING
      extends StObject
         with XE
    /* 12 */ val CONTENT_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CONTENT_MISSING & Double = js.native
    
    @js.native
    sealed trait CONVERTER_UNSUPPORTED
      extends StObject
         with XE
    /* 8 */ val CONVERTER_UNSUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CONVERTER_UNSUPPORTED & Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC
      extends StObject
         with XE
    /* 13 */ val CRYPTOGRAPHIC: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC & Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC_NO_MODULE
      extends StObject
         with XE
    /* 14 */ val CRYPTOGRAPHIC_NO_MODULE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC_NO_MODULE & Double = js.native
    
    @js.native
    sealed trait CRYPTOGRAPHIC_UNKNOWN_TRANSFORM
      extends StObject
         with XE
    /* 15 */ val CRYPTOGRAPHIC_UNKNOWN_TRANSFORM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.CRYPTOGRAPHIC_UNKNOWN_TRANSFORM & Double = js.native
    
    @js.native
    sealed trait DECORATOR_NULL_PARAM
      extends StObject
         with XE
    /* 3 */ val DECORATOR_NULL_PARAM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.DECORATOR_NULL_PARAM & Double = js.native
    
    @js.native
    sealed trait ELEMENT_MALFORMED
      extends StObject
         with XE
    /* 9 */ val ELEMENT_MALFORMED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ELEMENT_MALFORMED & Double = js.native
    
    @js.native
    sealed trait ELEMENT_MISSING
      extends StObject
         with XE
    /* 10 */ val ELEMENT_MISSING: typingsJapgolly.xmlCore.distTypesErrorMod.XE.ELEMENT_MISSING & Double = js.native
    
    @js.native
    sealed trait METHOD_NOT_IMPLEMENTED
      extends StObject
         with XE
    /* 5 */ val METHOD_NOT_IMPLEMENTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.METHOD_NOT_IMPLEMENTED & Double = js.native
    
    @js.native
    sealed trait METHOD_NOT_SUPPORTED
      extends StObject
         with XE
    /* 6 */ val METHOD_NOT_SUPPORTED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.METHOD_NOT_SUPPORTED & Double = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with XE
    /* 0 */ val NONE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NONE & Double = js.native
    
    @js.native
    sealed trait NULL_PARAM
      extends StObject
         with XE
    /* 2 */ val NULL_PARAM: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NULL_PARAM & Double = js.native
    
    @js.native
    sealed trait NULL_REFERENCE
      extends StObject
         with XE
    /* 1 */ val NULL_REFERENCE: typingsJapgolly.xmlCore.distTypesErrorMod.XE.NULL_REFERENCE & Double = js.native
    
    @js.native
    sealed trait PARAM_REQUIRED
      extends StObject
         with XE
    /* 7 */ val PARAM_REQUIRED: typingsJapgolly.xmlCore.distTypesErrorMod.XE.PARAM_REQUIRED & Double = js.native
    
    @js.native
    sealed trait XML_EXCEPTION
      extends StObject
         with XE
    /* 18 */ val XML_EXCEPTION: typingsJapgolly.xmlCore.distTypesErrorMod.XE.XML_EXCEPTION & Double = js.native
  }
  
  @JSImport("xml-core/dist/types/error", "XmlError")
  @js.native
  open class XmlError protected ()
    extends StObject
       with Error {
    def this(code: XE, args: Any*) = this()
    
    var code: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* protected */ val prefix: /* "XMLJS" */ String = js.native
  }
}
