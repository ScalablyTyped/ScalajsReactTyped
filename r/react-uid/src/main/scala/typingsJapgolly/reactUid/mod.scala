package typingsJapgolly.reactUid

import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactUid.distEs5ContextMod.UIDProps
import typingsJapgolly.reactUid.distEs5ControlMod.WithPrefix
import typingsJapgolly.reactUid.distEs5HooksMod.SeedGenerator
import typingsJapgolly.reactUid.distEs5UidcomponentMod.UID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-uid", "UIDConsumer")
  @js.native
  val UIDConsumer: FC[UIDProps] = js.native
  
  @JSImport("react-uid", "UIDFork")
  @js.native
  val UIDFork: FC[PropsWithChildren[WithPrefix]] = js.native
  
  @JSImport("react-uid", "UIDReset")
  @js.native
  val UIDReset: FC[PropsWithChildren[WithPrefix]] = js.native
  
  @JSImport("react-uid", "UID")
  @js.native
  open class UID_ protected () extends UID {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: Any) = this()
  }
  
  inline def generateUID(): js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUID")().asInstanceOf[js.Function2[/* item */ Any, /* index */ js.UndefOr[Double], String]]
  
  inline def uid(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def uid(item: Any, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useUID")().asInstanceOf[String]
  
  inline def useUIDSeed(): SeedGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useUIDSeed")().asInstanceOf[SeedGenerator]
}
