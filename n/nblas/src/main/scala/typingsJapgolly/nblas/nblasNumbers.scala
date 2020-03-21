package typingsJapgolly.nblas

import typingsJapgolly.nblas.typesMod.MatrixLeftRight
import typingsJapgolly.nblas.typesMod.MatrixTrans
import typingsJapgolly.nblas.typesMod.MatrixUnit
import typingsJapgolly.nblas.typesMod.MatrixUpperLower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nblasNumbers {
  @js.native
  sealed trait `111` extends MatrixTrans
  
  @js.native
  sealed trait `112` extends MatrixTrans
  
  @js.native
  sealed trait `113` extends MatrixTrans
  
  @js.native
  sealed trait `121` extends MatrixUpperLower
  
  @js.native
  sealed trait `122` extends MatrixUpperLower
  
  @js.native
  sealed trait `131` extends MatrixUnit
  
  @js.native
  sealed trait `132` extends MatrixUnit
  
  @js.native
  sealed trait `141` extends MatrixLeftRight
  
  @js.native
  sealed trait `142` extends MatrixLeftRight
  
  @scala.inline
  def `111`: `111` = 111.asInstanceOf[`111`]
  @scala.inline
  def `112`: `112` = 112.asInstanceOf[`112`]
  @scala.inline
  def `113`: `113` = 113.asInstanceOf[`113`]
  @scala.inline
  def `121`: `121` = 121.asInstanceOf[`121`]
  @scala.inline
  def `122`: `122` = 122.asInstanceOf[`122`]
  @scala.inline
  def `131`: `131` = 131.asInstanceOf[`131`]
  @scala.inline
  def `132`: `132` = 132.asInstanceOf[`132`]
  @scala.inline
  def `141`: `141` = 141.asInstanceOf[`141`]
  @scala.inline
  def `142`: `142` = 142.asInstanceOf[`142`]
}

