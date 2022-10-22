package typingsJapgolly.antdMobileRn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("antd-mobile-rn", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd-mobile-rn", "Toast.LONG")
  @js.native
  def LONG: Double = js.native
  inline def LONG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG")(x.asInstanceOf[js.Any])
  
  @JSImport("antd-mobile-rn", "Toast.SHORT")
  @js.native
  def SHORT: Double = js.native
  inline def SHORT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHORT")(x.asInstanceOf[js.Any])
  
  inline def fail(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def fail(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def fail(content: String, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fail")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  inline def info(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def info(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def info(content: String, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loading(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loading(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def loading(content: String, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loading")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def offline(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def offline(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def offline(content: String, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("offline")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def show(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def show(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def show(content: String, duration: Double, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def show(content: String, duration: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def success(content: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def success(content: String, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Double, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Double, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Double, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Unit, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Unit, onClose: js.Function0[Unit], mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def success(content: String, duration: Unit, onClose: Unit, mask: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("success")(content.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], mask.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
