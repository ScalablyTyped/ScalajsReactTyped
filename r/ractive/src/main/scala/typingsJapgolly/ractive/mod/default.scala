package typingsJapgolly.ractive.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ractive.anon.Instantiable
import typingsJapgolly.ractive.anon.ReadonlyArrayExtendOptsan
import typingsJapgolly.ractive.ractiveBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ractive", JSImport.Default)
@js.native
open class default[T /* <: Ractive[T] */] () extends Ractive[T] {
  def this(opts: InitOpts[T]) = this()
}
/* static members */
object default {
  
  @JSImport("ractive", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof ContextHelper` */
  @JSImport("ractive", "default.Context")
  @js.native
  open class Context ()
    extends typingsJapgolly.ractive.mod.Ractive.Context
  
  /** When true, causes Ractive to emit warnings. Defaults to true. */
  @JSImport("ractive", "default.DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.DEBUG_PROMISES")
  @js.native
  def DEBUG_PROMISES: Boolean = js.native
  inline def DEBUG_PROMISES_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG_PROMISES")(x.asInstanceOf[js.Any])
  
  /** The parent constructor used to create this constructor. */
  @JSImport("ractive", "default.Parent")
  @js.native
  def Parent: Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
  inline def Parent_=(x: Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parent")(x.asInstanceOf[js.Any])
  
  /** The Ractive constructor used to create this constructor. */
  @JSImport("ractive", "default.Ractive")
  @js.native
  def Ractive: Instantiable = js.native
  inline def Ractive_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ractive")(x.asInstanceOf[js.Any])
  
  /** The build version of Ractive. */
  @JSImport("ractive", "default.VERSION")
  @js.native
  val VERSION: String = js.native
  
  /** Setting this to false will prevent Ractive from printing a welcome console message when the first instance is created. */
  @JSImport("ractive", "default.WELCOME_MESSAGE")
  @js.native
  def WELCOME_MESSAGE: js.UndefOr[`false`] = js.native
  inline def WELCOME_MESSAGE_=(x: js.UndefOr[`false`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WELCOME_MESSAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.adaptors")
  @js.native
  def adaptors: Registry[Adaptor] = js.native
  inline def adaptors_=(x: Registry[Adaptor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("adaptors")(x.asInstanceOf[js.Any])
  
  /**
  	 * Add Ractive-managed CSS to the managed style tag. This effectively global CSS managed by the Ractive constructor,
  	 * as opposed scoped CSS installed on a component constructor.
  	 */
  inline def addCSS(id: String, css: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addCSS(id: String, css: CssFn): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addCSS")(id.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("ractive", "default.components")
  @js.native
  def components: Registry[Component] = js.native
  inline def components_=(x: Registry[Component]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.decorators")
  @js.native
  def decorators: Registry[Decorator[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.native
  inline def decorators_=(x: Registry[Decorator[Ractive[/* ractive.ractive.Ractive<any> */ Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decorators")(x.asInstanceOf[js.Any])
  
  /** The registries that are inherited by all instance. */
  @JSImport("ractive", "default.defaults")
  @js.native
  def defaults: Registries[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = js.native
  inline def defaults_=(x: Registries[Ractive[/* ractive.ractive.Ractive<any> */ Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.easings")
  @js.native
  def easings: Registry[Easing] = js.native
  inline def easings_=(x: Registry[Easing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easings")(x.asInstanceOf[js.Any])
  
  /** Escape the given key, so that it can be safely used in a keypath e.g. 'foo.bar' becomes 'foo\.bar' */
  inline def escapeKey(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("ractive", "default.events")
  @js.native
  def events: Registry[EventPlugin[Ractive[/* ractive.ractive.Ractive<any> */ Any]]] = js.native
  inline def events_=(x: Registry[EventPlugin[Ractive[/* ractive.ractive.Ractive<any> */ Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  
  /** Create a new component with this constructor as a starting point. */
  inline def extend(): Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]]]
  inline def extend[T /* <: ExtendOpts[Any] & ValueMap */, U /* <: ReadonlyArrayExtendOptsan */](
    opts: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param more because its type U is not an array type */ more: U
  ): Static[
    (Ractive[/* ractive.ractive.Ractive<any> */ Any]) & (Merge[T, U, ExtendOpts[Ractive[/* ractive.ractive.Ractive<any> */ Any]]])
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(opts.asInstanceOf[js.Any], more.asInstanceOf[js.Any])).asInstanceOf[Static[
    (Ractive[/* ractive.ractive.Ractive<any> */ Any]) & (Merge[T, U, ExtendOpts[Ractive[/* ractive.ractive.Ractive<any> */ Any]]])
  ]]
  
  /** Create a new component with this constructor as a starting point using the given constructor. */
  inline def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V]): Static[Ractive[U] & U] = ^.asInstanceOf[js.Dynamic].applyDynamic("extendWith")(c.asInstanceOf[js.Any]).asInstanceOf[Static[Ractive[U] & U]]
  inline def extendWith[U /* <: Ractive[U] */, V /* <: InitOpts[U] */, W /* <: ExtendOpts[U] */](c: Constructor[U, V], opts: W): Static[Ractive[U] & U] = (^.asInstanceOf[js.Dynamic].applyDynamic("extendWith")(c.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Static[Ractive[U] & U]]
  
  /** Retrieve the CSS string for all loaded components. */
  inline def getCSS(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCSS")().asInstanceOf[String]
  
  inline def getContext(nodeOrQuery: String): ContextHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(nodeOrQuery.asInstanceOf[js.Any]).asInstanceOf[ContextHelper]
  /** Get a Context for the given node or selector. */
  inline def getContext(nodeOrQuery: HTMLElement): ContextHelper = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(nodeOrQuery.asInstanceOf[js.Any]).asInstanceOf[ContextHelper]
  
  /** Check to see if CSS with the given id has already been added */
  inline def hasCSS(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasCSS")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("ractive", "default.helpers")
  @js.native
  def helpers: Registry[Helper] = js.native
  inline def helpers_=(x: Registry[Helper]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("helpers")(x.asInstanceOf[js.Any])
  
  @JSImport("ractive", "default.interpolators")
  @js.native
  def interpolators: Registry[Interpolator] = js.native
  inline def interpolators_=(x: Registry[Interpolator]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolators")(x.asInstanceOf[js.Any])
  
  /** @returns true if the given object is an instance of this constructor */
  inline def isInstance(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Safely join the given keys into a keypath. */
  inline def joinKeys(keys: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinKeys")(keys.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
  
  /**
  	 * Initialize a macro function.
  	 * @param macro
  	 * @param options
  	 */
  inline def `macro`(`macro`: MacroFn): Macro = ^.asInstanceOf[js.Dynamic].applyDynamic("macro")(`macro`.asInstanceOf[js.Any]).asInstanceOf[Macro]
  inline def `macro`(`macro`: MacroFn, options: MacroOpts): Macro = (^.asInstanceOf[js.Dynamic].applyDynamic("macro")(`macro`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Macro]
  
  /**
  	 * Parse the given template string into a template.j
  	 */
  inline def parse(template: String): ParsedTemplate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any]).asInstanceOf[ParsedTemplate]
  inline def parse(template: String, opts: ParseOpts): ParsedTemplate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(template.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedTemplate]
  
  @JSImport("ractive", "default.partials")
  @js.native
  def partials: Registry[Partial] = js.native
  inline def partials_=(x: Registry[Partial]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("partials")(x.asInstanceOf[js.Any])
  
  /** Render component styles in their own style tags rather than in a single shared tag - defaults to false */
  @JSImport("ractive", "default.perComponentStyleElements")
  @js.native
  def perComponentStyleElements: Boolean = js.native
  inline def perComponentStyleElements_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perComponentStyleElements")(x.asInstanceOf[js.Any])
  
  /** Get the value at the given keypath from the Ractive shared store. */
  inline def sharedGet[U](keypath: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedGet")(keypath.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /** Set the given map of values in the Ractive shared store. */
  inline def sharedSet(map: ValueMap): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sharedSet")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /** Set the given keypath in the Ractive shared store to the given value. */
  inline def sharedSet[U](keypath: String, value: U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("sharedSet")(keypath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  /** Split the given keypath into its constituent keys. */
  inline def splitKeypath(keypath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitKeypath")(keypath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /** Get the css data for this constructor at the given keypath. */
  inline def styleGet[U](keypath: String): U = ^.asInstanceOf[js.Dynamic].applyDynamic("styleGet")(keypath.asInstanceOf[js.Any]).asInstanceOf[U]
  
  /** Set the given map of values in the css data for this constructor. */
  inline def styleSet(map: ValueMap): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("styleSet")(map.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /** Set the css data for this constructor at the given keypath to the given value. */
  inline def styleSet[U](keypath: String, value: U): js.Promise[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("styleSet")(keypath.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[U]]
  
  /** true if Ractive detects that this environment supports svg. */
  @JSImport("ractive", "default.svg")
  @js.native
  val svg: Boolean = js.native
  
  /**
  	 * The current operation promise is available to things like observers and decorators using Ractive.tick,
  	 * which will return undefined if there is not currently an operation in progress.
  	 */
  @JSImport("ractive", "default.tick")
  @js.native
  val tick: js.UndefOr[js.Promise[Unit]] = js.native
  
  @JSImport("ractive", "default.transitions")
  @js.native
  def transitions: Registry[Transition] = js.native
  inline def transitions_=(x: Registry[Transition]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transitions")(x.asInstanceOf[js.Any])
  
  /** Unescape the given key e.g. 'foo\.bar' becomes 'foo.bar'.k */
  inline def unescapeKey(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeKey")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def use(args: Plugin*): Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("use")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Static[Ractive[/* ractive.ractive.Ractive<any> */ Any]]]
}
