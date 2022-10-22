package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.libGrammarNameAddrHeaderMod.NameAddrHeader
import typingsJapgolly.sipJs.libGrammarUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGrammarGrammarMod {
  
  object Grammar {
    
    @JSImport("sip.js/lib/grammar/grammar", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Parse the given string and returns a SIP.URI instance or undefined if
      * it is an invalid URI.
      * @param uri -
      */
    inline def URIParse(uri: String): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("URIParse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
    
    /**
      * Parse the given string and returns a SIP.NameAddrHeader instance or undefined if
      * it is an invalid NameAddrHeader.
      * @param name_addr_header -
      */
    inline def nameAddrHeaderParse(nameAddrHeader: String): js.UndefOr[NameAddrHeader] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameAddrHeaderParse")(nameAddrHeader.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NameAddrHeader]]
    
    /**
      * Parse.
      * @param input -
      * @param startRule -
      */
    inline def parse(input: String, startRule: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], startRule.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
}
