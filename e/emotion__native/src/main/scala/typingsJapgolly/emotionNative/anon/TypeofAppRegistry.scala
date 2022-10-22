package typingsJapgolly.emotionNative.anon

import typingsJapgolly.reactNative.mod.AppConfig
import typingsJapgolly.reactNative.mod.ComponentProvider
import typingsJapgolly.reactNative.mod.Runnable
import typingsJapgolly.reactNative.mod.TaskProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAppRegistry extends StObject {
  
  def getAppKeys(): js.Array[String] = js.native
  
  def getRunnable(appKey: String): js.UndefOr[Runnable] = js.native
  
  def registerComponent(appKey: String, getComponentFunc: ComponentProvider): String = js.native
  
  def registerConfig(config: js.Array[AppConfig]): Unit = js.native
  
  def registerHeadlessTask(appKey: String, task: TaskProvider): Unit = js.native
  
  def registerRunnable(appKey: String, func: Runnable): String = js.native
  
  def runApplication(appKey: String, appParameters: Any): Unit = js.native
  
  def setSurfaceProps(appKey: String, appParameters: Any): Unit = js.native
  def setSurfaceProps(appKey: String, appParameters: Any, displayMode: Double): Unit = js.native
  
  def unmountApplicationComponentAtRootTag(rootTag: Double): Unit = js.native
}
