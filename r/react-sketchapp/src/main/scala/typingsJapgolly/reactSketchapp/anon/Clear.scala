package typingsJapgolly.reactSketchapp.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSketchapp.libModuleSharedStylesTextStylesMod.Options
import typingsJapgolly.reactSketchapp.libModuleSharedStylesTextStylesMod.RegisteredStyle
import typingsJapgolly.reactSketchapp.libModuleSharedStylesTextStylesMod.StyleHash
import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libModuleTypesMod.SketchDocument
import typingsJapgolly.reactSketchapp.libModuleTypesMod.SketchDocumentData
import typingsJapgolly.reactSketchapp.libModuleTypesMod.TextStyle
import typingsJapgolly.reactSketchapp.libModuleTypesMod.WrappedSketchDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends StObject {
  
  def clear(): Unit = js.native
  
  def create(styles: StringDictionary[TextStyle]): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Unit, platformBridge: PlatformBridge): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Options): StyleHash = js.native
  def create(styles: StringDictionary[TextStyle], options: Options, platformBridge: PlatformBridge): StyleHash = js.native
  
  def get(name: String): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: SketchDocument): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: SketchDocumentData): js.UndefOr[TextStyle] = js.native
  def get(name: String, document: WrappedSketchDocument): js.UndefOr[TextStyle] = js.native
  
  def registerStyle(name: String, style: TextStyle): Unit = js.native
  def registerStyle(name: String, style: TextStyle, platformBridge: PlatformBridge): Unit = js.native
  
  def resolve(): js.UndefOr[RegisteredStyle] = js.native
  def resolve(style: TextStyle): js.UndefOr[RegisteredStyle] = js.native
  
  def styles(): StyleHash = js.native
  
  def toJSON(): js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.SharedStyle */ Any
  ] = js.native
}
