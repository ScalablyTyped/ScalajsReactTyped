package typingsJapgolly.navermaps.naver.maps

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageTile
  extends StObject
     with Tile {
  
  def getImageElements(): js.Array[HTMLElement] = js.native
  
  def getUrls(): js.Array[String] = js.native
  
  def setUrls(urls: js.Array[String]): Unit = js.native
}
