package typingsJapgolly.inversify

import typingsJapgolly.inversify.anon.Name
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.MetadataReader
import typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces.Target
import typingsJapgolly.std.NewableFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningReflectionUtilsMod {
  
  @JSImport("inversify/lib/planning/reflection_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseClassDependencyCount(metadataReader: MetadataReader, func: NewableFunction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseClassDependencyCount")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDependencies(metadataReader: MetadataReader, func: NewableFunction): js.Array[Target] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencies")(metadataReader.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Target]]
  
  inline def getFunctionName(func: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(func.asInstanceOf[js.Any]).asInstanceOf[String]
}
