package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.assetMod.Archive
import typingsJapgolly.pulumiPulumi.assetMod.Asset
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.queryableMod.ResolvedResource
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResource
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceTransformation
import typingsJapgolly.pulumiPulumi.resourceMod.URN
import typingsJapgolly.pulumiPulumi.runtimeClosureCodePathsMod.CodePathOptions
import typingsJapgolly.pulumiPulumi.runtimeClosureSerializeClosureMod.SerializeFunctionArgs
import typingsJapgolly.pulumiPulumi.runtimeClosureSerializeClosureMod.SerializedFunction
import typingsJapgolly.pulumiPulumi.runtimeMocksMod.Mocks
import typingsJapgolly.pulumiPulumi.runtimeRpcMod.OutputResolvers
import typingsJapgolly.pulumiPulumi.runtimeRpcMod.ResourceModule
import typingsJapgolly.pulumiPulumi.runtimeRpcMod.ResourcePackage
import typingsJapgolly.pulumiPulumi.runtimeRpcMod.SerializationOptions
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterable
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncQueryable
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeMod {
  
  @JSImport("@pulumi/pulumi/runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "Stack")
  @js.native
  open class Stack protected ()
    extends typingsJapgolly.pulumiPulumi.runtimeStackMod.Stack {
    def this(init: js.Function0[js.Promise[Inputs]]) = this()
  }
  
  @JSImport("@pulumi/pulumi/runtime", "StreamInvokeResponse")
  @js.native
  open class StreamInvokeResponse[T] protected ()
    extends typingsJapgolly.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
  }
  
  inline def allConfig(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("allConfig")().asInstanceOf[StringDictionary[String]]
  
  inline def cacheDynamicProviders(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheDynamicProviders")().asInstanceOf[Boolean]
  
  inline def call[T](tok: String, props: Inputs): Output_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Output_[T]]
  inline def call[T](tok: String, props: Inputs, res: Resource): Output_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Output_[T]]
  
  inline def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")().asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: Unit,
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(
    extraIncludePaths: Unit,
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(extraIncludePaths: Unit, extraIncludePackages: Unit, extraExcludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(extraIncludePaths.asInstanceOf[js.Any], extraIncludePackages.asInstanceOf[js.Any], extraExcludePackages.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  inline def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeCodePaths")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Map[String, Asset | Archive]]]
  
  inline def deserializeProperties(outputsStruct: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperties")(outputsStruct.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def deserializeProperty(prop: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def disconnect(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[js.Promise[Unit]]
  
  inline def disconnectSync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disconnectSync")().asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime", "excessiveDebugOutput")
  @js.native
  val excessiveDebugOutput: Boolean = js.native
  
  inline def getConfig(k: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(k.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEngine(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngine")().asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getMaximumListeners(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaximumListeners")().asInstanceOf[Double]
  
  inline def getMonitor(): js.UndefOr[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMonitor")().asInstanceOf[js.UndefOr[js.Object]]
  
  inline def getOrganization(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrganization")().asInstanceOf[String]
  
  inline def getProject(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getProject")().asInstanceOf[String]
  
  inline def getResource(res: Resource, parent: Unit, props: Inputs, custom: Boolean, urn: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], urn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getResource(res: Resource, parent: Resource, props: Inputs, custom: Boolean, urn: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], props.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], urn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getResourceModule(pkg: String, mod: String, version: String): js.UndefOr[ResourceModule] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourceModule")(pkg.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResourceModule]]
  
  inline def getResourcePackage(pkg: String, version: String): js.UndefOr[ResourcePackage] = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcePackage")(pkg.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResourcePackage]]
  
  inline def getStack(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStack")().asInstanceOf[String]
  
  inline def getStackResource(): js.UndefOr[typingsJapgolly.pulumiPulumi.runtimeStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackResource")().asInstanceOf[js.UndefOr[typingsJapgolly.pulumiPulumi.runtimeStackMod.Stack]]
  
  inline def hasEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEngine")().asInstanceOf[Boolean]
  
  inline def hasMonitor(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMonitor")().asInstanceOf[Boolean]
  
  inline def invoke(tok: String, props: Inputs): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def isDryRun(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDryRun")().asInstanceOf[Boolean]
  
  inline def isLegacyApplyEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyApplyEnabled")().asInstanceOf[Boolean]
  
  inline def isQueryMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQueryMode")().asInstanceOf[Boolean]
  
  inline def isRpcSecret(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def listResourceOutputs[U /* <: Resource */](): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")().asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ Any, /* is U */ Boolean]): AsyncQueryable[ResolvedResource[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any]).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: js.Function1[/* o */ Any, /* is U */ Boolean], stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  inline def listResourceOutputs[U /* <: Resource */](typeFilter: Unit, stackName: String): AsyncQueryable[ResolvedResource[U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("listResourceOutputs")(typeFilter.asInstanceOf[js.Any], stackName.asInstanceOf[js.Any])).asInstanceOf[AsyncQueryable[ResolvedResource[U]]]
  
  inline def monitorSupportsFeature(feature: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsFeature")(feature.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsOutputValues(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsOutputValues")().asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsResourceReferences(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsResourceReferences")().asInstanceOf[js.Promise[Boolean]]
  
  inline def monitorSupportsSecrets(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorSupportsSecrets")().asInstanceOf[js.Promise[Boolean]]
  
  inline def readResource(res: Resource, parent: Unit, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def readResource(res: Resource, parent: Resource, t: String, name: String, props: Inputs, opts: ResourceOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResource(
    res: Resource,
    parent: Unit,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], newDependency.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerResource(
    res: Resource,
    parent: Resource,
    t: String,
    name: String,
    custom: Boolean,
    remote: Boolean,
    newDependency: js.Function1[/* urn */ URN, Resource],
    props: Inputs,
    opts: ResourceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResource")(res.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any], name.asInstanceOf[js.Any], custom.asInstanceOf[js.Any], remote.asInstanceOf[js.Any], newDependency.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResourceModule(pkg: String, mod: String, module: ResourceModule): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceModule")(pkg.asInstanceOf[js.Any], mod.asInstanceOf[js.Any], module.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResourceOutputs(res: Resource, outputs: js.Promise[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerResourceOutputs(res: Resource, outputs: Inputs): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerResourceOutputs(res: Resource, outputs: Output_[Inputs]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourceOutputs")(res.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerResourcePackage(pkg: String, resourcePackage: ResourcePackage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerResourcePackage")(pkg.asInstanceOf[js.Any], resourcePackage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerStackTransformation(t: ResourceTransformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStackTransformation")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetOptions(
    project: String,
    stack: String,
    parallel: Double,
    engineAddr: String,
    monitorAddr: String,
    preview: Boolean,
    organization: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resetOptions")(project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], parallel.asInstanceOf[js.Any], engineAddr.asInstanceOf[js.Any], monitorAddr.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  @JSImport("@pulumi/pulumi/runtime", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  inline def rpcKeepAlive(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rpcKeepAlive")().asInstanceOf[js.Function0[Unit]]
  
  inline def runInPulumiStack(init: js.Function0[js.Promise[Any]]): js.Promise[js.UndefOr[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runInPulumiStack")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Inputs]]]
  
  inline def serialize(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")().asInstanceOf[Boolean]
  
  inline def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SerializedFunction]]
  inline def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedFunction]]
  
  inline def serializeFunctionAsync(func: js.Function): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ Any, Boolean]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any], serialize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def serializeProperties(label: String, props: Inputs): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  inline def serializeProperties(label: String, props: Inputs, opts: SerializationOptions): js.Promise[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Record[String, Any]]]
  
  inline def serializeProperty(ctx: String, prop: Input[Any], dependentResources: Set[Resource]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def serializeProperty(ctx: String, prop: Input[Any], dependentResources: Set[Resource], opts: SerializationOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeProperty")(ctx.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], dependentResources.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def serializeResourceProperties(label: String, props: Inputs): js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]]]
  inline def serializeResourceProperties(label: String, props: Inputs, opts: SerializationOptions): js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeResourceProperties")(label.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Record[String, Any], Map[String, Set[Resource]]]]]
  
  inline def setAllConfig(c: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAllConfig")(c.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setAllConfig(c: StringDictionary[String], secretKeys: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAllConfig")(c.asInstanceOf[js.Any], secretKeys.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setConfig(k: String, v: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(k.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setMockOptions(mockMonitor: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: String, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: String, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Boolean, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setMockOptions(mockMonitor: Any, project: Unit, stack: Unit, preview: Unit, organization: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMockOptions")(mockMonitor.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], preview.asInstanceOf[js.Any], organization.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  
  inline def setRootResource(res: ComponentResource[Any]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setRootResource")(res.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@pulumi/pulumi/runtime", "specialArchiveSig")
  @js.native
  val specialArchiveSig: /* "0def7320c3a5731c473e5ecbe6d01bc7" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialAssetSig")
  @js.native
  val specialAssetSig: /* "c44067f5952c0a294b673a41bacd8c17" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialOutputValueSig")
  @js.native
  val specialOutputValueSig: /* "d0e6a833031e9bbcd3f4e8bde6ca49a4" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialResourceSig")
  @js.native
  val specialResourceSig: /* "5cf8f73096256a8f31e491e813e4eb8e" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialSecretSig")
  @js.native
  val specialSecretSig: /* "1b47061264138c4ac30d75fd1eb44270" */ String = js.native
  
  @JSImport("@pulumi/pulumi/runtime", "specialSigKey")
  @js.native
  val specialSigKey: /* "4dabf18193072939515e22adb298388d" */ String = js.native
  
  inline def streamInvoke(tok: String, props: Inputs): js.Promise[typingsJapgolly.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[Any]]]
  inline def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[typingsJapgolly.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.pulumiPulumi.runtimeInvokeMod.StreamInvokeResponse[Any]]]
  
  inline def suppressUnhandledGrpcRejections[T](p: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressUnhandledGrpcRejections")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def terminateRpcs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateRpcs")().asInstanceOf[Unit]
  
  inline def transferProperties(onto: Resource, label: String, props: Inputs): OutputResolvers = (^.asInstanceOf[js.Dynamic].applyDynamic("transferProperties")(onto.asInstanceOf[js.Any], label.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[OutputResolvers]
  
  @JSImport("@pulumi/pulumi/runtime", "unknownValue")
  @js.native
  val unknownValue: /* "04da6b54-80e4-46f7-96ec-b56ff0331ba9" */ String = js.native
  
  inline def unwrapRpcSecret(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapRpcSecret")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}
