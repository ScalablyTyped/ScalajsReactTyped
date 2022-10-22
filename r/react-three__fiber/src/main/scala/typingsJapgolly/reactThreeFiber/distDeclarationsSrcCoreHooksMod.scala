package typingsJapgolly.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.ErrorEvent
import org.scalajs.dom.ProgressEvent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreRendererMod.LocalState
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RenderCallback
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreStoreMod.RootState
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.ObjectMap
import typingsJapgolly.three.mod.LoadingManager
import typingsJapgolly.three.mod.Object3D
import typingsJapgolly.three.srcCoreEventDispatcherMod.Event
import typingsJapgolly.zustand.reactMod.UseBoundStore
import typingsJapgolly.zustand.vanillaMod.EqualityChecker
import typingsJapgolly.zustand.vanillaMod.StateSelector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcCoreHooksMod {
  
  @JSImport("@react-three/fiber/dist/declarations/src/core/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFrame(callback: RenderCallback): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any]).asInstanceOf[Null]
  inline def useFrame(callback: RenderCallback, renderPriority: Double): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("useFrame")(callback.asInstanceOf[js.Any], renderPriority.asInstanceOf[js.Any])).asInstanceOf[Null]
  
  inline def useGraph(`object`: Object3D[Event]): ObjectMap = ^.asInstanceOf[js.Dynamic].applyDynamic("useGraph")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectMap]
  
  inline def useInstanceHandle[O](ref: MutableRefObject[O]): MutableRefObject[LocalState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceHandle")(ref.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[LocalState]]
  
  object useLoader {
    
    inline def apply[T](Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]], input: String): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Extensions
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: String,
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: string extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Extensions
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    inline def apply[T](
      Proto: Instantiable1[/* manager */ js.UndefOr[LoadingManager], LoaderResult[T]],
      input: js.Array[String],
      extensions: Extensions,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): /* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any = (^.asInstanceOf[js.Dynamic].apply(Proto.asInstanceOf[js.Any], input.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], onProgress.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: std.Array<string> extends std.Array<any> ? std.Array<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap>> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.BranchingReturn<T, three.three/examples/jsm/loaders/GLTFLoader.GLTF, three.three/examples/jsm/loaders/GLTFLoader.GLTF & @react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.ObjectMap> */ js.Any]
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/hooks", "useLoader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/hooks", "useLoader.clear")
    @js.native
    def clear: js.Function2[
        /* Proto */ Instantiable0[LoaderResult[Any]], 
        /* input */ String | js.Array[String], 
        Unit
      ] = js.native
    inline def clear_=(
      x: js.Function2[
          /* Proto */ Instantiable0[LoaderResult[Any]], 
          /* input */ String | js.Array[String], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-three/fiber/dist/declarations/src/core/hooks", "useLoader.preload")
    @js.native
    def preload: js.Function3[
        /* Proto */ Instantiable0[LoaderResult[Any]], 
        /* input */ String | js.Array[String], 
        /* extensions */ js.UndefOr[Extensions], 
        Unit
      ] = js.native
    inline def preload_=(
      x: js.Function3[
          /* Proto */ Instantiable0[LoaderResult[Any]], 
          /* input */ String | js.Array[String], 
          /* extensions */ js.UndefOr[Extensions], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  inline def useStore(): UseBoundStore[RootState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStore")().asInstanceOf[UseBoundStore[RootState]]
  
  inline def useThree[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")().asInstanceOf[T]
  inline def useThree[T](selector: Unit, equalityFn: EqualityChecker[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def useThree[T](selector: StateSelector[RootState, T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useThree[T](selector: StateSelector[RootState, T], equalityFn: EqualityChecker[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useThree")(selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type BranchingReturn[T, Parent, Coerced] = ConditionalType[T, Parent, Coerced, T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Child extends Parent ? Truthy : Falsy
    }}}
    */
  @js.native
  trait ConditionalType[Child, Parent, Truthy, Falsy] extends StObject
  
  type Extensions = js.Function1[/* loader */ typingsJapgolly.three.mod.Loader, Unit]
  
  @js.native
  trait Loader[T]
    extends typingsJapgolly.three.mod.Loader {
    
    def load(url: String): Any = js.native
    def load(url: String, onLoad: js.Function1[/* result */ T, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* result */ T, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(url: String, onLoad: Unit, onProgress: js.Function1[/* event */ ProgressEvent, Unit]): Any = js.native
    def load(
      url: String,
      onLoad: Unit,
      onProgress: js.Function1[/* event */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Any = js.native
    def load(url: String, onLoad: Unit, onProgress: Unit, onError: js.Function1[/* event */ ErrorEvent, Unit]): Any = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> ? @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.Loader<T[number]> : @react-three/fiber.@react-three/fiber/dist/declarations/src/core/hooks.Loader<T>
    }}}
    */
  @js.native
  trait LoaderResult[T] extends StObject
}
