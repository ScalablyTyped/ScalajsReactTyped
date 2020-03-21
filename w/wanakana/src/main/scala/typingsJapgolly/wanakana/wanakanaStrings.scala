package typingsJapgolly.wanakana

import typingsJapgolly.wanakana.mod.IMEModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wanakanaStrings {
  @js.native
  sealed trait hepburn extends js.Object
  
  @js.native
  sealed trait toHiragana extends IMEModes
  
  @js.native
  sealed trait toKatakana extends IMEModes
  
  @scala.inline
  def hepburn: hepburn = "hepburn".asInstanceOf[hepburn]
  @scala.inline
  def toHiragana: toHiragana = "toHiragana".asInstanceOf[toHiragana]
  @scala.inline
  def toKatakana: toKatakana = "toKatakana".asInstanceOf[toKatakana]
}

