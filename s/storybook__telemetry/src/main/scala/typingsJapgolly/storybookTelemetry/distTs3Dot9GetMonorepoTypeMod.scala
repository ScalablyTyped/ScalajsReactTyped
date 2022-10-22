package typingsJapgolly.storybookTelemetry

import typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.lageDotconfigDotjson
import typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.lernaDotjson
import typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.nxDotjson
import typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.rushDotjson
import typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.turboDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9GetMonorepoTypeMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMonorepoType(): MonorepoType = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonorepoType")().asInstanceOf[MonorepoType]
  
  object monorepoConfigs {
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Lage")
    @js.native
    val Lage: lageDotconfigDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Lerna")
    @js.native
    val Lerna: lernaDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Nx")
    @js.native
    val Nx: nxDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Rush")
    @js.native
    val Rush: rushDotjson = js.native
    
    @JSImport("@storybook/telemetry/dist/ts3.9/get-monorepo-type", "monorepoConfigs.Turborepo")
    @js.native
    val Turborepo: turboDotjson = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Nx
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Turborepo
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Lerna
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Rush
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Lage
    - typingsJapgolly.storybookTelemetry.storybookTelemetryStrings.Workspaces
    - scala.Unit
  */
  type MonorepoType = js.UndefOr[_MonorepoType]
  
  trait _MonorepoType extends StObject
}
