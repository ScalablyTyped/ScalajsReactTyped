package typingsJapgolly.amapJsApi.global.AMap

import typingsJapgolly.amapJsApi.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Size")
@js.native
open class Size protected ()
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.Size {
  /**
    * 地物对象的像素尺寸
    * @param width 宽度像素
    * @param height 长度像素
    */
  def this(width: Double, height: Double) = this()
  
  // internal
  /* CompleteClass */
  override def contains(size: X): Boolean = js.native
  
  /**
    * 获得高度
    */
  /* CompleteClass */
  override def getHeight(): Double = js.native
  
  /**
    * 获得宽度
    */
  /* CompleteClass */
  override def getWidth(): Double = js.native
}
