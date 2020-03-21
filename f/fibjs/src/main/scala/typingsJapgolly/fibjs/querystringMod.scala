package typingsJapgolly.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief http query 处理模块
	* @detail 引用方法：,```JavaScript,var querystring = require('querystring');,```
	*/
@JSImport("querystring", JSImport.Namespace)
@js.native
object querystringMod extends js.Object {
  def escape(str: String): String = js.native
  def parse(str: String): ClassHttpCollection = js.native
  def parse(str: String, sep: String): ClassHttpCollection = js.native
  def parse(str: String, sep: String, eq: String): ClassHttpCollection = js.native
  def parse(str: String, sep: String, eq: String, opt: js.Object): ClassHttpCollection = js.native
  def stringify(obj: js.Object): String = js.native
  def stringify(obj: js.Object, sep: String): String = js.native
  def stringify(obj: js.Object, sep: String, eq: String): String = js.native
  def stringify(obj: js.Object, sep: String, eq: String, opt: js.Object): String = js.native
  def unescape(str: String): String = js.native
}

