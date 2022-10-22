package typingsJapgolly.w3cXmlserializer

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(root: Node): String = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(root: Node, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("w3c-xmlserializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Whether the serialization algorithm will throw an `Error`
      * when the `Node` can't be serialized to well-formed XML.
      *
      * @default false
      */
    var requireWellFormed: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRequireWellFormed(value: Boolean): Self = StObject.set(x, "requireWellFormed", value.asInstanceOf[js.Any])
      
      inline def setRequireWellFormedUndefined: Self = StObject.set(x, "requireWellFormed", js.undefined)
    }
  }
}
