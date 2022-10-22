package typingsJapgolly.antvGBase

import typingsJapgolly.antvGBase.libInterfacesMod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBboxUtilMod {
  
  @JSImport("@antv/g-base/lib/bbox/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeArrowBBox(shape: IShape, bbox: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeArrowBBox")(shape.asInstanceOf[js.Any], bbox.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def mergeBBox(bbox1: Any, bbox2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeBBox")(bbox1.asInstanceOf[js.Any], bbox2.asInstanceOf[js.Any])).asInstanceOf[Any]
}
