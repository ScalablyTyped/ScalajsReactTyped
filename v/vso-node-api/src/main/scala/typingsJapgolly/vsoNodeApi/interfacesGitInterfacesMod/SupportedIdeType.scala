package typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SupportedIdeType extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "SupportedIdeType")
@js.native
object SupportedIdeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SupportedIdeType & Double] = js.native
  
  @js.native
  sealed trait AndroidStudio
    extends StObject
       with SupportedIdeType
  /* 1 */ val AndroidStudio: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.AndroidStudio & Double = js.native
  
  @js.native
  sealed trait AppCode
    extends StObject
       with SupportedIdeType
  /* 2 */ val AppCode: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.AppCode & Double = js.native
  
  @js.native
  sealed trait CLion
    extends StObject
       with SupportedIdeType
  /* 3 */ val CLion: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.CLion & Double = js.native
  
  @js.native
  sealed trait DataGrip
    extends StObject
       with SupportedIdeType
  /* 4 */ val DataGrip: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.DataGrip & Double = js.native
  
  @js.native
  sealed trait Eclipse
    extends StObject
       with SupportedIdeType
  /* 13 */ val Eclipse: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.Eclipse & Double = js.native
  
  @js.native
  sealed trait IntelliJ
    extends StObject
       with SupportedIdeType
  /* 5 */ val IntelliJ: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.IntelliJ & Double = js.native
  
  @js.native
  sealed trait MPS
    extends StObject
       with SupportedIdeType
  /* 6 */ val MPS: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.MPS & Double = js.native
  
  @js.native
  sealed trait PhpStorm
    extends StObject
       with SupportedIdeType
  /* 7 */ val PhpStorm: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.PhpStorm & Double = js.native
  
  @js.native
  sealed trait PyCharm
    extends StObject
       with SupportedIdeType
  /* 8 */ val PyCharm: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.PyCharm & Double = js.native
  
  @js.native
  sealed trait RubyMine
    extends StObject
       with SupportedIdeType
  /* 9 */ val RubyMine: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.RubyMine & Double = js.native
  
  @js.native
  sealed trait Tower
    extends StObject
       with SupportedIdeType
  /* 10 */ val Tower: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.Tower & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with SupportedIdeType
  /* 0 */ val Unknown: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.Unknown & Double = js.native
  
  @js.native
  sealed trait VisualStudio
    extends StObject
       with SupportedIdeType
  /* 11 */ val VisualStudio: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.VisualStudio & Double = js.native
  
  @js.native
  sealed trait WebStorm
    extends StObject
       with SupportedIdeType
  /* 12 */ val WebStorm: typingsJapgolly.vsoNodeApi.interfacesGitInterfacesMod.SupportedIdeType.WebStorm & Double = js.native
}
