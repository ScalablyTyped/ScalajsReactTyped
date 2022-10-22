package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.anon.PlaintextLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecipherCCM extends StObject {
  
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
  
  def setAuthTag(buffer: ArrayBufferView): this.type = js.native
}
