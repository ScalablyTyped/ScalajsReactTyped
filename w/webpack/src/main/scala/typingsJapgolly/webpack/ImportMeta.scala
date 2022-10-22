package typingsJapgolly.webpack

import typingsJapgolly.webpack.anon.Exclude
import typingsJapgolly.webpack.webpack.Context
import typingsJapgolly.webpack.webpack.Hot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportMeta extends StObject {
  
  var url: String = js.native
  
  var webpack: Double = js.native
  
  def webpackContext(request: String): Context = js.native
  def webpackContext(request: String, options: Exclude): Context = js.native
  
  var webpackHot: Hot = js.native
}
