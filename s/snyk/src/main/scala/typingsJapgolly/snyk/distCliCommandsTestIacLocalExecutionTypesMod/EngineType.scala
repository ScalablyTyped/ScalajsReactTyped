package typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EngineType extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "EngineType")
@js.native
object EngineType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EngineType & Double] = js.native
  
  @js.native
  sealed trait ARM
    extends StObject
       with EngineType
  /* 3 */ val ARM: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType.ARM & Double = js.native
  
  @js.native
  sealed trait CloudFormation
    extends StObject
       with EngineType
  /* 2 */ val CloudFormation: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType.CloudFormation & Double = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with EngineType
  /* 4 */ val Custom: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType.Custom & Double = js.native
  
  @js.native
  sealed trait Kubernetes
    extends StObject
       with EngineType
  /* 0 */ val Kubernetes: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType.Kubernetes & Double = js.native
  
  @js.native
  sealed trait Terraform
    extends StObject
       with EngineType
  /* 1 */ val Terraform: typingsJapgolly.snyk.distCliCommandsTestIacLocalExecutionTypesMod.EngineType.Terraform & Double = js.native
}
