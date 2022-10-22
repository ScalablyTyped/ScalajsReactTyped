package typingsJapgolly.sxml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleMod {
  
  @JSImport("sxml/lib/module", "XML")
  @js.native
  open class XML ()
    extends typingsJapgolly.sxml.libModuleXmlMod.XML {
    def this(str: String) = this()
    def this(xml: typingsJapgolly.sxml.libModuleXmlMod.XML) = this()
  }
  /* static members */
  object XML {
    
    @JSImport("sxml/lib/module", "XML")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module", "XML._Compute_min_index")
    @js.native
    def _Compute_min_index: Any = js.native
    inline def _Compute_min_index_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Compute_min_index")(x.asInstanceOf[js.Any])
    
    /**
      * @hidden
      */
    @JSImport("sxml/lib/module", "XML._Repeat")
    @js.native
    def _Repeat: Any = js.native
    inline def _Repeat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Repeat")(x.asInstanceOf[js.Any])
    
    inline def decodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeProperty(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_property")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeValue(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_value")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def head(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")().asInstanceOf[String]
    inline def head(encoding: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(encoding.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("sxml/lib/module", "XMLList")
  @js.native
  open class XMLList ()
    extends typingsJapgolly.sxml.libModuleXmllistMod.XMLList
}
