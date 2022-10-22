package typingsJapgolly.maquette

import typingsJapgolly.maquette.distInterfacesMod.Projector
import typingsJapgolly.maquette.distInterfacesMod.ProjectorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProjectorMod {
  
  @JSImport("maquette/dist/projector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("maquette/dist/projector", "createProjector")
  @js.native
  def createProjector: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector] = js.native
  inline def createProjector_=(x: js.Function1[/* projectorOptions */ js.UndefOr[ProjectorOptions], Projector]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createProjector")(x.asInstanceOf[js.Any])
}
