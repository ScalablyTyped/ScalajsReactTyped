package typingsJapgolly.objectPath

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined object-path.object-path.ObjectPathStatic & {  withInheritedProps :object-path.object-path.ObjectPathStatic, create (options : object-path.object-path.Options | undefined): object-path.object-path.ObjectPathStatic} */
object mod {
  
  /**
    * Binds an object
    */
  inline def apply[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectPathBound[T]]
  
  @JSImport("object-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def coalesce[TResult](`object`: js.Object, paths: js.Array[Path]): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  inline def coalesce[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TResult]
  inline def coalesce[TResult](`object`: js.Object, paths: Path): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  /**
    * Get the first non undefined property
    */
  inline def coalesce[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  inline def coalesce_TResult_Union[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  inline def coalesce_TResult_Union[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("coalesce")(`object`.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  
  inline def create(): ObjectPathStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ObjectPathStatic]
  inline def create(options: Options): ObjectPathStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ObjectPathStatic]
  
  /**
    * Deletes a member from object or array
    */
  inline def del(`object`: js.Object, path: Path): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
    * are set to empty, numbers to 0, everything else is set to null
    */
  inline def empty(`object`: js.Object, path: Path): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("empty")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def ensureExists[TResult](`object`: js.Object, path: Path): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExists")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  /**
    * Set a value if it doesn't exist, do nothing if it does
    */
  inline def ensureExists[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExists")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  inline def ensureExists_TResult_Union[TResult](`object`: js.Object, path: Path, defaultValue: TResult): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureExists")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  
  /**
    * Get a path from an object
    */
  inline def get(`object`: js.Object, path: Path): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TResult]
  
  /**
    * Tests path existence
    */
  inline def has(`object`: js.Object, path: Path): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Insert an item in an array path
    */
  inline def insert(`object`: js.Object, path: Path, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def insert(`object`: js.Object, path: Path, value: Any, at: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], at.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
    */
  inline def push(`object`: js.Object, path: Path, items: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")((scala.List(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).`++`(items.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  /**
    * Set a path to a value
    * @return Any existing value on the path if any
    */
  inline def set[TResult](`object`: js.Object, path: Path, value: TResult): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  inline def set[TResult](`object`: js.Object, path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(`object`.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], doNotReplace.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TResult]]
  
  @JSImport("object-path", "withInheritedProps")
  @js.native
  def withInheritedProps: ObjectPathStatic = js.native
  /**
    * Binds an object
    */
  inline def withInheritedProps[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInheritedProps")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectPathBound[T]]
  inline def withInheritedProps_=(x: ObjectPathStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("withInheritedProps")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ObjectPathBound[T /* <: js.Object */] extends StObject {
    
    def coalesce[TResult](paths: js.Array[Path]): js.UndefOr[TResult] = js.native
    def coalesce[TResult](paths: js.Array[Path], defaultValue: TResult): TResult = js.native
    def coalesce[TResult](paths: Path): js.UndefOr[TResult] = js.native
    /**
      * @see objectPath.coalesce
      */
    def coalesce[TResult](paths: Path, defaultValue: TResult): TResult = js.native
    @JSName("coalesce")
    def coalesce_TResult_Union[TResult](paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
    @JSName("coalesce")
    def coalesce_TResult_Union[TResult](paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    
    /**
      * @see objectPath.del
      */
    def del(path: Path): StringDictionary[Any] = js.native
    
    /**
      * @see objectPath.empty
      */
    def empty(path: Path): Any = js.native
    
    def ensureExists[TResult](path: Path): js.UndefOr[TResult] = js.native
    /**
      * @see objectPath.ensureExists
      */
    def ensureExists[TResult](path: Path, defaultValue: TResult): TResult = js.native
    @JSName("ensureExists")
    def ensureExists_TResult_Union[TResult](path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    
    /**
      * @see objectPath.get
      */
    def get(path: Path): Any = js.native
    def get[TResult](path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * @see objectPath.has
      */
    def has(path: Path): Boolean = js.native
    
    /**
      * @see objectPath.insert
      */
    def insert(path: Path, value: Any): Unit = js.native
    def insert(path: Path, value: Any, at: Double): Unit = js.native
    
    /**
      * @see objectPath.push
      */
    def push(path: Path, items: Any*): Unit = js.native
    
    /**
      * @see objectPath.set
      */
    def set[TResult](path: Path, value: TResult): js.UndefOr[TResult] = js.native
    def set[TResult](path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
  }
  
  @js.native
  trait ObjectPathStatic extends StObject {
    
    /**
      * Binds an object
      */
    def apply[T /* <: js.Object */](`object`: T): ObjectPathBound[T] = js.native
    
    def coalesce[TResult](`object`: js.Object, paths: js.Array[Path]): js.UndefOr[TResult] = js.native
    def coalesce[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): TResult = js.native
    def coalesce[TResult](`object`: js.Object, paths: Path): js.UndefOr[TResult] = js.native
    /**
      * Get the first non undefined property
      */
    def coalesce[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): TResult = js.native
    @JSName("coalesce")
    def coalesce_TResult_Union[TResult](`object`: js.Object, paths: js.Array[Path], defaultValue: TResult): js.UndefOr[TResult] = js.native
    @JSName("coalesce")
    def coalesce_TResult_Union[TResult](`object`: js.Object, paths: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    
    /**
      * Deletes a member from object or array
      */
    def del(`object`: js.Object, path: Path): StringDictionary[Any] = js.native
    
    /**
      * Empty a path. Arrays are set to length 0, objects have all elements deleted, strings
      * are set to empty, numbers to 0, everything else is set to null
      */
    def empty(`object`: js.Object, path: Path): Any = js.native
    
    def ensureExists[TResult](`object`: js.Object, path: Path): js.UndefOr[TResult] = js.native
    /**
      * Set a value if it doesn't exist, do nothing if it does
      */
    def ensureExists[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
    @JSName("ensureExists")
    def ensureExists_TResult_Union[TResult](`object`: js.Object, path: Path, defaultValue: TResult): js.UndefOr[TResult] = js.native
    
    /**
      * Get a path from an object
      */
    def get(`object`: js.Object, path: Path): Any = js.native
    def get[TResult](`object`: js.Object, path: Path, defaultValue: TResult): TResult = js.native
    
    /**
      * Tests path existence
      */
    def has(`object`: js.Object, path: Path): Boolean = js.native
    
    /**
      * Insert an item in an array path
      */
    def insert(`object`: js.Object, path: Path, value: Any): Unit = js.native
    def insert(`object`: js.Object, path: Path, value: Any, at: Double): Unit = js.native
    
    /**
      * Create (if path isn't an array) and push the value to it. Can push unlimited number of values
      */
    def push(`object`: js.Object, path: Path, items: Any*): Unit = js.native
    
    /**
      * Set a path to a value
      * @return Any existing value on the path if any
      */
    def set[TResult](`object`: js.Object, path: Path, value: TResult): js.UndefOr[TResult] = js.native
    def set[TResult](`object`: js.Object, path: Path, value: TResult, doNotReplace: Boolean): js.UndefOr[TResult] = js.native
  }
  
  trait Options extends StObject {
    
    var includeInheritedProps: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeInheritedProps(value: Boolean): Self = StObject.set(x, "includeInheritedProps", value.asInstanceOf[js.Any])
      
      inline def setIncludeInheritedPropsUndefined: Self = StObject.set(x, "includeInheritedProps", js.undefined)
    }
  }
  
  type Path = (js.Array[Double | String]) | Double | String
}
