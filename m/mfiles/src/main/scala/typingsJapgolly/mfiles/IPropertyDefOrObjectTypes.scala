package typingsJapgolly.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropertyDefOrObjectTypes extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, PropertyDefOrObjectType: IPropertyDefOrObjectType): Unit = js.native
  def Clone(): IPropertyDefOrObjectTypes = js.native
  def Item(Index: Double): IPropertyDefOrObjectType = js.native
  def Item(Index: Double, value: IPropertyDefOrObjectType): Unit = js.native
  def Remove(Index: Double): Unit = js.native
}

