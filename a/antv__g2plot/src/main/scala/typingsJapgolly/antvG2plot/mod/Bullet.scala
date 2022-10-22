package typingsJapgolly.antvG2plot.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvG2plot.anon.PartialBulletOptions
import typingsJapgolly.antvG2plot.libPlotsBulletTypesMod.BulletOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2plot", "Bullet")
@js.native
open class Bullet protected ()
  extends typingsJapgolly.antvG2plot.libPlotsBulletMod.Bullet {
  def this(container: String, options: BulletOptions) = this()
  def this(container: HTMLElement, options: BulletOptions) = this()
}
/* static members */
object Bullet {
  
  @JSImport("@antv/g2plot", "Bullet")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * 获取 子弹图 默认配置项
    * 供外部使用
    */
  inline def getDefaultOptions(): PartialBulletOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOptions")().asInstanceOf[PartialBulletOptions]
}
