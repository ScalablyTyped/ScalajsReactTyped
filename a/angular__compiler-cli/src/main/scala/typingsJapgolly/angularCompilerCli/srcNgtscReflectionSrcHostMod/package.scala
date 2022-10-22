package typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod

import typingsJapgolly.angularCompilerCli.angularCompilerCliInts.`0`
import typingsJapgolly.angularCompilerCli.anon.Name
import typingsJapgolly.angularCompilerCli.srcNgtscReflectionSrcHostMod.^
import typingsJapgolly.typescript.mod.Expression
import typingsJapgolly.typescript.mod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def isConcreteDeclaration(decl: Declaration[typingsJapgolly.typescript.mod.Declaration]): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConcreteDeclaration")(decl.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.ConcreteDeclaration<typescript.typescript.Declaration> */ Boolean]

inline def isDecoratorIdentifier(exp: Expression): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecoratorIdentifier")(exp.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/reflection/src/host.DecoratorIdentifier */ Boolean]

type ClassDeclaration[T /* <: DeclarationNode */] = T & Name

type DeclarationNode = typingsJapgolly.typescript.mod.Declaration | Expression

type DecoratorIdentifier = Identifier | NamespacedIdentifier

type SpecialDeclarationIdentity = DownleveledEnum

type SpecialDeclarationKind = `0`
