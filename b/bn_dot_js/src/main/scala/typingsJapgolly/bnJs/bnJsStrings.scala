package typingsJapgolly.bnJs

import typingsJapgolly.bnJs.mod.Endianness
import typingsJapgolly.bnJs.mod.IPrimeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bnJsStrings {
  
  @js.native
  sealed trait be
    extends StObject
       with Endianness
  inline def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait hex extends StObject
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait k256
    extends StObject
       with IPrimeName
  inline def k256: k256 = "k256".asInstanceOf[k256]
  
  @js.native
  sealed trait le
    extends StObject
       with Endianness
  inline def le: le = "le".asInstanceOf[le]
  
  @js.native
  sealed trait mod extends StObject
  inline def mod: mod = "mod".asInstanceOf[mod]
  
  @js.native
  sealed trait p192
    extends StObject
       with IPrimeName
  inline def p192: p192 = "p192".asInstanceOf[p192]
  
  @js.native
  sealed trait p224
    extends StObject
       with IPrimeName
  inline def p224: p224 = "p224".asInstanceOf[p224]
  
  @js.native
  sealed trait p25519
    extends StObject
       with IPrimeName
  inline def p25519: p25519 = "p25519".asInstanceOf[p25519]
}
