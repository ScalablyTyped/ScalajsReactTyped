package typingsJapgolly.hasha

import typingsJapgolly.hasha.mod.HashaEncoding
import typingsJapgolly.hasha.mod.ToStringEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashaStrings {
  
  @js.native
  sealed trait base64
    extends StObject
       with HashaEncoding
       with ToStringEncoding
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait buffer
    extends StObject
       with HashaEncoding
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait hex
    extends StObject
       with HashaEncoding
       with ToStringEncoding
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait latin1
    extends StObject
       with HashaEncoding
       with ToStringEncoding
  inline def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait md5 extends StObject
  inline def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait sha1 extends StObject
  inline def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256 extends StObject
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha512 extends StObject
  inline def sha512: sha512 = "sha512".asInstanceOf[sha512]
}
