package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.resourceMod.ProviderResource
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeRpcMod {
  
  @JSImport("@pulumi/pulumi/runtime/rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeProperties(outputsStruct: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperties")(outputsStruct.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def deserializeProperty(prop: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getResourceModule(pkg: String, mod: String, version: String): js.UndefOr[ResourceModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourceModule")(pkg.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResourceModule]]
  
  inline def getResourcePackage(pkg: String, version: String): js.UndefOr[ResourcePackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePackage")(pkg.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResourcePackage]]
  
  inline def isRpcSecret(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerResourceModule(pkg: String, mod: String, module: ResourceModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceModule")(pkg.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResourcePackage(pkg: String, resourcePackage: ResourcePackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourcePackage")(pkg.asInstanceOf[js.Any], resourcePackage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[js.Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: Any,
    deps: Record[String, js.Array[Resource]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolveProperties(
    res: Resource,
    resolvers: Record[
      String, 
      js.Function5[
        /* v */ Any, 
        /* isKnown */ Boolean, 
        /* isSecret */ Boolean, 
        /* deps */ js.UndefOr[js.Array[Resource]], 
        /* err */ js.UndefOr[js.Error], 
        Unit
      ]
    ],
    t: String,
    name: String,
    allProps: Any,
    deps: Record[String, js.Array[Resource]],
    err: js.Error
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProperties")(res.asInstanceOf[js.Any], resolvers.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], allProps.asInstanceOf[js.Any], deps.asInstanceOf[js.Any], err.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  inline def serializeProperties(label: String, props: Inputs, opts: SerializationOptions): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  
  inline def serializeProperty(ctx: String, prop: Input[Any], dependentResources: Set[Resource]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def serializeProperty(ctx: String, prop: Input[Any], dependentResources: Set[Resource], opts: SerializationOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]]]
  inline def serializeResourceProperties(label: String, props: Inputs, opts: SerializationOptions): js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]]]
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialArchiveSig")
  @js.native
  val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialAssetSig")
  @js.native
  val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialOutputValueSig")
  @js.native
  val specialOutputValueSig: /* "d0e6a833031e9bbcd3f4e8bde6ca49a4" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialResourceSig")
  @js.native
  val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialSecretSig")
  @js.native
  val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "specialSigKey")
  @js.native
  val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
  
  inline def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressUnhandledGrpcRejections")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = (^.asInstanceOf[js.Dynamic].applyDynamic("transferProperties")(onto.asInstanceOf[js.Any], label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OutputResolvers]
  
  @JSImport("@pulumi/pulumi/runtime/rpc", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  inline def unwrapRpcSecret(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  type OutputResolvers = Record[
    String, 
    js.Function5[
      /* value */ Any, 
      /* isStable */ Boolean, 
      /* isSecret */ Boolean, 
      /* deps */ js.UndefOr[js.Array[Resource]], 
      /* err */ js.UndefOr[js.Error], 
      Unit
    ]
  ]
  
  trait ResourceModule extends StObject {
    
    def construct(name: String, `type`: String, urn: String): Resource
    
    val version: js.UndefOr[String] = js.undefined
  }
  object ResourceModule {
    
    inline def apply(construct: (String, String, String) => Resource): ResourceModule = {
      val __obj = js.Dynamic.literal(construct = js.Any.fromFunction3(construct))
      __obj.asInstanceOf[ResourceModule]
    }
    
    extension [Self <: ResourceModule](x: Self) {
      
      inline def setConstruct(value: (String, String, String) => Resource): Self = StObject.set(x, "construct", js.Any.fromFunction3(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ResourcePackage extends StObject {
    
    def constructProvider(name: String, `type`: String, urn: String): ProviderResource
    
    val version: js.UndefOr[String] = js.undefined
  }
  object ResourcePackage {
    
    inline def apply(constructProvider: (String, String, String) => ProviderResource): ResourcePackage = {
      val __obj = js.Dynamic.literal(constructProvider = js.Any.fromFunction3(constructProvider))
      __obj.asInstanceOf[ResourcePackage]
    }
    
    extension [Self <: ResourcePackage](x: Self) {
      
      inline def setConstructProvider(value: (String, String, String) => ProviderResource): Self = StObject.set(x, "constructProvider", js.Any.fromFunction3(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait SerializationOptions extends StObject {
    
    /**
      * true if we are keeping output values.
      * If the monitor does not support output values, they will not be kept, even when this is set to true.
      */
    var keepOutputValues: js.UndefOr[Boolean] = js.undefined
  }
  object SerializationOptions {
    
    inline def apply(): SerializationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializationOptions]
    }
    
    extension [Self <: SerializationOptions](x: Self) {
      
      inline def setKeepOutputValues(value: Boolean): Self = StObject.set(x, "keepOutputValues", value.asInstanceOf[js.Any])
      
      inline def setKeepOutputValuesUndefined: Self = StObject.set(x, "keepOutputValues", js.undefined)
    }
  }
}
