package typingsJapgolly.expoXcpretty

import typingsJapgolly.expoXcpretty.anon.Checked
import typingsJapgolly.expoXcpretty.anon.Source
import typingsJapgolly.expoXcpretty.anon.Version
import typingsJapgolly.expoXcpretty.buildUtilsParsePodfileLockMod.PodfileLock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsGetFirstExternalSourceForPodMod {
  
  @JSImport("@expo/xcpretty/build/utils/getFirstExternalSourceForPod", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependentPods(podfileLock: PodfileLock, hasNameVersion: Version): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependentPods")(podfileLock.asInstanceOf[js.Any], hasNameVersion.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getFirstExternalSourceForPod(podfileLock: PodfileLock, hasNameChecked: Checked): Source | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstExternalSourceForPod")(podfileLock.asInstanceOf[js.Any], hasNameChecked.asInstanceOf[js.Any])).asInstanceOf[Source | Null]
}
