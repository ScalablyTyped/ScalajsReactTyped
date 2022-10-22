package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.anon.Id
import typingsJapgolly.pulumiPulumi.anon.State
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMocksMod {
  
  @JSImport("@pulumi/pulumi/runtime/mocks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/mocks", "MockMonitor")
  @js.native
  open class MockMonitor protected () extends StObject {
    def this(mocks: Mocks) = this()
    
    def invoke(req: Any, callback: js.Function2[/* err */ Any, /* innerResponse */ Any, Unit]): js.Promise[Unit] = js.native
    
    val mocks: Mocks = js.native
    
    /* private */ var newUrn: Any = js.native
    
    def readResource(req: Any, callback: js.Function2[/* err */ Any, /* innterResponse */ Any, Unit]): js.Promise[Unit] = js.native
    
    def registerResource(req: Any, callback: js.Function2[/* err */ Any, /* innerResponse */ Any, Unit]): js.Promise[Unit] = js.native
    
    def registerResourceOutputs(req: Any, callback: js.Function2[/* err */ Any, /* innerResponse */ Any, Unit]): Unit = js.native
    
    val resources: Map[String, Id] = js.native
    
    def supportsFeature(req: Any, callback: js.Function2[/* err */ Any, /* innerResponse */ Any, Unit]): Unit = js.native
  }
  
  inline def setMocks(mocks: Mocks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: String, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMocks(mocks: Mocks, project: Unit, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMocks")(mocks.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MockCallArgs extends StObject {
    
    /**
      * The arguments provided to the function call.
      */
    var inputs: Any
    
    /**
      * If provided, the identifier of the provider instance being used to make the call.
      */
    var provider: js.UndefOr[String] = js.undefined
    
    /**
      * The token that indicates which function is being called. This token is of the form "package:module:function".
      */
    var token: String
  }
  object MockCallArgs {
    
    inline def apply(inputs: Any, token: String): MockCallArgs = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockCallArgs]
    }
    
    extension [Self <: MockCallArgs](x: Self) {
      
      inline def setInputs(value: Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait MockResourceArgs extends StObject {
    
    /**
      * Specifies whether or not the resource is Custom (i.e. managed by a resource provider).
      */
    var custom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If provided, the physical identifier of an existing resource to read or import.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The inputs for the resource.
      */
    var inputs: Any
    
    /**
      * The logical name of the resource instance.
      */
    var name: String
    
    /**
      * If provided, the identifier of the provider instance being used to manage this resource.
      */
    var provider: js.UndefOr[String] = js.undefined
    
    /**
      * The token that indicates which resource type is being constructed. This token is of the form "package:module:type".
      */
    var `type`: String
  }
  object MockResourceArgs {
    
    inline def apply(inputs: Any, name: String, `type`: String): MockResourceArgs = {
      val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MockResourceArgs]
    }
    
    extension [Self <: MockResourceArgs](x: Self) {
      
      inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputs(value: Any): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mocks extends StObject {
    
    /**
      * Mocks provider-implemented function calls (e.g. aws.get_availability_zones).
      *
      * @param args: MockCallArgs
      */
    def call(args: MockCallArgs): Record[String, Any]
    
    /**
      * Mocks resource construction calls. This function should return the physical identifier and the output properties
      * for the resource being constructed.
      * @param args: MockResourceArgs
      */
    def newResource(args: MockResourceArgs): State
  }
  object Mocks {
    
    inline def apply(call: MockCallArgs => Record[String, Any], newResource: MockResourceArgs => State): Mocks = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call), newResource = js.Any.fromFunction1(newResource))
      __obj.asInstanceOf[Mocks]
    }
    
    extension [Self <: Mocks](x: Self) {
      
      inline def setCall(value: MockCallArgs => Record[String, Any]): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setNewResource(value: MockResourceArgs => State): Self = StObject.set(x, "newResource", js.Any.fromFunction1(value))
    }
  }
}
