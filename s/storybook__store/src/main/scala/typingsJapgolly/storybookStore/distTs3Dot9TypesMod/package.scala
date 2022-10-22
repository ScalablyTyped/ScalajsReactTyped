package typingsJapgolly.storybookStore.distTs3Dot9TypesMod

import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import typingsJapgolly.storybookStore.anon.ArgTypes
import typingsJapgolly.storybookStore.anon.StoryFn
import typingsJapgolly.storybookStore.storybookStoreStrings.story
import typingsJapgolly.storybookStore.storybookStoreStrings.storyName
import typingsJapgolly.synchronousPromise.mod.SynchronousPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BoundStory[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] = Story[TFramework] & StoryFn

type DecoratorApplicator[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] = js.Function2[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ /* storyFn */ Any, 
/* decorators */ js.Array[
  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DecoratorFunction<TFramework> */ Any
], 
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LegacyStoryFn<TFramework> */ Any]

type ModuleExports = Record[String, Any]

type ModuleImportFn = js.Function1[/* path */ Path, PromiseLike[ModuleExports]]

type NormalizedStoryAnnotations[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] = (Omit[
/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryAnnotations<TFramework> */ Any, 
storyName | story]) & ArgTypes

type Path = String

type PromiseLike[T] = js.Promise[T] | SynchronousPromise[T]

/* Rewritten from type alias, can be one of: 
  - / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId * / scala.Any
  - typingsJapgolly.storybookStore.anon.Name
  - typingsJapgolly.storybookStore.storybookStoreStrings.Asterisk
*/
type StorySpecifier = _StorySpecifier | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StoryId */ Any)
