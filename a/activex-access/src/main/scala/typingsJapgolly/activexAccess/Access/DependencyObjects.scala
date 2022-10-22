package typingsJapgolly.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DependencyObjects extends StObject {
  
  def apply(Index: String): AccessObject = js.native
  def apply(Index: Double): AccessObject = js.native
  
  val Application: typingsJapgolly.activexAccess.Access.Application = js.native
  
  val Count: Double = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def Item(Index: String): AccessObject = js.native
  def Item(Index: Double): AccessObject = js.native
  
  val Parent: Any = js.native
}
