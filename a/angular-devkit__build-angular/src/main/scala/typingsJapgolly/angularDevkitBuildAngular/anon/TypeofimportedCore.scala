package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typingsJapgolly.angularDevkitCore.srcUtilsTemplateMod.TemplateAst
import typingsJapgolly.angularDevkitCore.srcUtilsTemplateMod.TemplateOptions
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.PosixPath
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.WindowsPath
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofimportedCore extends StObject {
  
  var BaseException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.BaseException] = js.native
  
  var CircularDependencyFoundException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.CircularDependencyFoundException] = js.native
  
  var ContentHasMutatedException: Instantiable1[
    /* path */ String, 
    typingsJapgolly.angularDevkitCore.mod.ContentHasMutatedException
  ] = js.native
  
  var DependencyNotFoundException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.DependencyNotFoundException] = js.native
  
  var FileAlreadyExistException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.FileAlreadyExistException] = js.native
  
  var FileDoesNotExistException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.FileDoesNotExistException] = js.native
  
  var InvalidPathException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.InvalidPathException] = js.native
  
  var InvalidUpdateRecordException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.InvalidUpdateRecordException] = js.native
  
  var MergeConflictException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.MergeConflictException] = js.native
  
  val NormalizedRoot: Path_ = js.native
  
  val NormalizedSep: Path_ = js.native
  
  var PartiallyOrderedSet: Instantiable0[typingsJapgolly.angularDevkitCore.mod.PartiallyOrderedSet[js.Object]] = js.native
  
  var PathCannotBeFragmentException: Instantiable1[
    /* path */ String, 
    typingsJapgolly.angularDevkitCore.mod.PathCannotBeFragmentException
  ] = js.native
  
  var PathIsDirectoryException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.PathIsDirectoryException] = js.native
  
  var PathIsFileException: Instantiable1[/* path */ String, typingsJapgolly.angularDevkitCore.mod.PathIsFileException] = js.native
  
  var PathMustBeAbsoluteException: Instantiable1[
    /* path */ String, 
    typingsJapgolly.angularDevkitCore.mod.PathMustBeAbsoluteException
  ] = js.native
  
  var PriorityQueue: Instantiable1[
    /* _comparator */ js.Function2[
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* x */ Any, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* y */ Any, 
      Double
    ], 
    typingsJapgolly.angularDevkitCore.mod.PriorityQueue[js.Object]
  ] = js.native
  
  var UnimplementedException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.UnimplementedException] = js.native
  
  var UnknownException: Instantiable1[/* message */ String, typingsJapgolly.angularDevkitCore.mod.UnknownException] = js.native
  
  var UnsupportedPlatformException: Instantiable0[typingsJapgolly.angularDevkitCore.mod.UnsupportedPlatformException] = js.native
  
  val analytics: Typeofanalytics = js.native
  
  def asPosixPath(path: Path_): PosixPath = js.native
  
  def asWindowsPath(path: Path_): WindowsPath = js.native
  
  def basename(path: Path_): PathFragment = js.native
  
  def deepCopy[T](value: T): T = js.native
  
  def dirname(path: Path_): Path_ = js.native
  
  val experimental: Typeofexperimental = js.native
  
  def extname(path: Path_): String = js.native
  
  def fragment(path: String): PathFragment = js.native
  
  def getSystemPath(path: Path_): String = js.native
  
  def isAbsolute(p: Path_): Boolean = js.native
  
  def isJsonArray(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonArray */ Boolean = js.native
  
  def isJsonObject(value: JsonValue): /* is @angular-devkit/core.@angular-devkit/core/src/json/utils.JsonObject */ Boolean = js.native
  
  def isPromise(obj: Any): /* is std.Promise<any> */ Boolean = js.native
  
  def join(p1: Path_, others: String*): Path_ = js.native
  
  val json: Typeofjson = js.native
  
  val logging: Typeoflogging = js.native
  
  def noCacheNormalize(path: String): Path_ = js.native
  
  def normalize(path: String): Path_ = js.native
  
  def path(template: TemplateStringsArray, substitutions: Any*): Path_ = js.native
  
  def relative(from: Path_, to: Path_): Path_ = js.native
  
  def resetNormalizeCache(): Unit = js.native
  
  def resolve(p1: Path_, p2: Path_): Path_ = js.native
  
  val schema: Typeofschema = js.native
  
  def split(path: Path_): js.Array[PathFragment] = js.native
  
  val strings: Typeofstrings = js.native
  
  val tags: Typeoftags = js.native
  
  def template[T](content: String): js.Function1[/* input */ T, String] = js.native
  def template[T](content: String, options: TemplateOptions): js.Function1[/* input */ T, String] = js.native
  
  def templateParser(sourceText: String, fileName: String): TemplateAst = js.native
  
  val virtualFs: TypeofvirtualFs = js.native
  
  val workspaces: Typeofworkspaces = js.native
}
