package typingsJapgolly.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnyFindOptions = typingsJapgolly.sequelize.mod.FindOptions[js.Any]
  /**
    * A hash of attributes to describe your search, accepting any field names. See `WhereOptions` for details.
    */
  type AnyWhereOptions = org.scalablytyped.runtime.StringDictionary[js.Array[typingsJapgolly.sequelize.mod.WhereOptions[js.Any]] | js.Object]
  /**
    * Options for Association Scope
    *
    * @see AssociationOptionsManyToMany
    */
  type AssociationScope = /**
    * The name of the column that will be used for the associated scope and it's value
    */
  org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The createAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.BelongsToCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToCreateAssociationMixinOptions | typingsJapgolly.sequelize.mod.CreateOptions | typingsJapgolly.sequelize.mod.BelongsToSetAssociationMixinOptions
    ], 
    typingsJapgolly.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.BelongsToGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.BelongsToGetAssociationMixinOptions], 
    typingsJapgolly.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The addAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.BelongsToManyAddAssociationMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyAddAssociationMixinOptions | typingsJapgolly.sequelize.mod.AnyFindOptions | typingsJapgolly.sequelize.mod.BulkCreateOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions | typingsJapgolly.sequelize.mod.InstanceDestroyOptions | typingsJapgolly.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.BelongsToManyAddAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyAddAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyAddAssociationsMixinOptions | typingsJapgolly.sequelize.mod.AnyFindOptions | typingsJapgolly.sequelize.mod.BulkCreateOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions | typingsJapgolly.sequelize.mod.InstanceDestroyOptions | typingsJapgolly.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.BelongsToManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.BelongsToManyCountAssociationsMixinOptions], 
    typingsJapgolly.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.BelongsToManyCreateAssociationMixin<RoleAttributes, UserRoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyCreateAssociationMixin[TAttributes, TInstance, TJoinTableAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyCreateAssociationMixinOptions | typingsJapgolly.sequelize.mod.CreateOptions | typingsJapgolly.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsJapgolly.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.BelongsToManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.BelongsToManyGetAssociationsMixinOptions], 
    typingsJapgolly.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.BelongsToManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyHasAssociationMixinOptions | typingsJapgolly.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.BelongsToManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyHasAssociationsMixinOptions | typingsJapgolly.sequelize.mod.BelongsToManyGetAssociationsMixinOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.BelongsToManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyRemoveAssociationMixinOptions | typingsJapgolly.sequelize.mod.InstanceDestroyOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.BelongsToManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManyRemoveAssociationsMixinOptions | typingsJapgolly.sequelize.mod.InstanceDestroyOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with belongsToMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsToMany(Role, { through: UserRole });
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.BelongsToManySetAssociationsMixin<RoleInstance, RoleId, UserRoleAttributes>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to-many/
    * @see Instance
    */
  type BelongsToManySetAssociationsMixin[TInstance, TInstancePrimaryKey, TJoinTableAttributes] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToManySetAssociationsMixinOptions | typingsJapgolly.sequelize.mod.AnyFindOptions | typingsJapgolly.sequelize.mod.BulkCreateOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions | typingsJapgolly.sequelize.mod.InstanceDestroyOptions | typingsJapgolly.sequelize.AnonThrough[TJoinTableAttributes]
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociation mixin applied to models with belongsTo.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.belongsTo(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.BelongsToSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/belongs-to/
    * @see Instance
    */
  type BelongsToSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.BelongsToSetAssociationMixinOptions | typingsJapgolly.sequelize.mod.InstanceSaveOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  type DataTypeBoolean = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeDateOnly = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeHStore = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeJSONB = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeJSONType = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeNow = typingsJapgolly.sequelize.mod.DataTypeAbstract
  type DataTypeTime = typingsJapgolly.sequelize.mod.DataTypeAbstract
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineAttributes = /**
    * The description of a database column
    */
  org.scalablytyped.runtime.StringDictionary[
    java.lang.String | typingsJapgolly.sequelize.mod.DataTypeAbstract | typingsJapgolly.sequelize.mod.DefineAttributeColumnOptions
  ]
  /**
    * Interface for getterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineGetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function0[js.Any]]
  /**
    * Interface for Attributes provided for a column
    *
    * @see Sequelize.define
    */
  type DefineModelAttributes[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: string | sequelize.sequelize.DataTypeAbstract | sequelize.sequelize.DefineAttributeColumnOptions}
    */ typingsJapgolly.sequelize.sequelizeStrings.DefineModelAttributes with js.Any
  /**
    * Interface for Define Scope Options
    *
    * @see DefineOptions
    */
  type DefineScopeOptions = /**
    * Name of the scope and it's query
    */
  org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sequelize.mod.AnyFindOptions | js.Function]
  /**
    * Interface for setterMethods in DefineOptions
    *
    * @see DefineOptions
    */
  type DefineSetterMethodsOptions = org.scalablytyped.runtime.StringDictionary[js.Function1[/* val */ js.Any, scala.Unit]]
  /**
    * Shortcut for types used in FindOptions.attributes
    */
  type FindOptionsAttributesArray = js.Array[
    java.lang.String | typingsJapgolly.sequelize.mod.literal | (js.Tuple2[
      java.lang.String | typingsJapgolly.sequelize.mod.cast | typingsJapgolly.sequelize.mod.fn | typingsJapgolly.sequelize.mod.literal, 
      java.lang.String
    ]) | typingsJapgolly.sequelize.mod.fn | typingsJapgolly.sequelize.mod.cast
  ]
  /**
    * Shortcut for order type in FindOptions.attributes
    */
  type FindOptionsOrderArray = js.Array[
    java.lang.String | scala.Double | (typingsJapgolly.sequelize.mod.Model[js.Any, js.Any, js.Any]) | typingsJapgolly.sequelize.AnonAs | typingsJapgolly.sequelize.mod.fn
  ]
  /**
    * GetTableName Options
    */
  type GetTableNameOptions = typingsJapgolly.sequelize.mod.LoggingOptions
  /**
    * The addAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    addRole: Sequelize.HasManyAddAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyAddAssociationMixinOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The addAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    addRoles: Sequelize.HasManyAddAssociationsMixin<RoleInstance, RoleId>;
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyAddAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyAddAssociationsMixinOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The countAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    countRoles: Sequelize.HasManyCountAssociationsMixin;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCountAssociationsMixin = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.HasManyCountAssociationsMixinOptions], 
    typingsJapgolly.bluebird.mod.^[scala.Double]
  ]
  /**
    * The createAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    createRole: Sequelize.HasManyCreateAssociationMixin<RoleAttributes>;
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyCreateAssociationMixin[TAttributes, TInstance] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyCreateAssociationMixinOptions | typingsJapgolly.sequelize.mod.CreateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[TInstance]
  ]
  /**
    * The getAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    getRoles: Sequelize.HasManyGetAssociationsMixin<RoleInstance>;
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyGetAssociationsMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.HasManyGetAssociationsMixinOptions], 
    typingsJapgolly.bluebird.mod.^[js.Array[TInstance]]
  ]
  /**
    * The hasAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    hasRole: Sequelize.HasManyHasAssociationMixin<RoleInstance, RoleId>;
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* target */ TInstance | TInstancePrimaryKey, 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyHasAssociationMixinOptions | typingsJapgolly.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles
    *    // hasRole...
    *    hasRoles: Sequelize.HasManyHasAssociationsMixin<RoleInstance, RoleId>;
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyHasAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* targets */ js.Array[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyHasAssociationsMixinOptions | typingsJapgolly.sequelize.mod.HasManyGetAssociationsMixinOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Boolean]
  ]
  /**
    * The removeAssociation mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    removeRole: Sequelize.HasManyRemoveAssociationMixin<RoleInstance, RoleId>;
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociated */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyRemoveAssociationMixinOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The removeAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    // setRoles...
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    removeRoles: Sequelize.HasManyRemoveAssociationsMixin<RoleInstance, RoleId>;
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManyRemoveAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* oldAssociateds */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManyRemoveAssociationsMixinOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The setAssociations mixin applied to models with hasMany.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasMany(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRoles...
    *    setRoles: Sequelize.HasManySetAssociationsMixin<RoleInstance, RoleId>;
    *    // addRoles...
    *    // addRole...
    *    // createRole...
    *    // removeRole...
    *    // removeRoles...
    *    // hasRole...
    *    // hasRoles...
    *    // countRoles...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-many/
    * @see Instance
    */
  type HasManySetAssociationsMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociations */ js.UndefOr[js.Array[TInstance | TInstancePrimaryKey]], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasManySetAssociationsMixinOptions | typingsJapgolly.sequelize.mod.AnyFindOptions | typingsJapgolly.sequelize.mod.InstanceUpdateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The createAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    // setRole...
    *    createRole: Sequelize.HasOneCreateAssociationMixin<RoleAttributes>;
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneCreateAssociationMixin[TAttributes] = js.Function2[
    /* values */ js.UndefOr[TAttributes], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasOneCreateAssociationMixinOptions | typingsJapgolly.sequelize.mod.HasOneSetAssociationMixinOptions | typingsJapgolly.sequelize.mod.CreateOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * The getAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttrib>, UserAttrib {
    *    getRole: Sequelize.HasOneGetAssociationMixin<RoleInstance>;
    *    // setRole...
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneGetAssociationMixin[TInstance] = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.sequelize.mod.HasOneGetAssociationMixinOptions], 
    typingsJapgolly.bluebird.mod.^[TInstance | scala.Null]
  ]
  /**
    * The setAssociation mixin applied to models with hasOne.
    * An example of usage is as follows:
    *
    * ```js
    *
    * User.hasOne(Role);
    *
    * interface UserInstance extends Sequelize.Instance<UserInstance, UserAttributes>, UserAttributes {
    *    // getRole...
    *    setRole: Sequelize.HasOneSetAssociationMixin<RoleInstance, RoleId>;
    *    // createRole...
    * }
    * ```
    *
    * @see http://docs.sequelizejs.com/en/latest/api/associations/has-one/
    * @see Instance
    */
  type HasOneSetAssociationMixin[TInstance, TInstancePrimaryKey] = js.Function2[
    /* newAssociation */ js.UndefOr[TInstance | TInstancePrimaryKey], 
    /* options */ js.UndefOr[
      typingsJapgolly.sequelize.mod.HasOneSetAssociationMixinOptions | typingsJapgolly.sequelize.mod.HasOneGetAssociationMixinOptions | typingsJapgolly.sequelize.mod.InstanceSaveOptions
    ], 
    typingsJapgolly.bluebird.mod.^[scala.Unit]
  ]
  /**
    * Models contains Model instances associated to their name
    */
  type Models = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type ModelsHashInterface = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sequelize.mod.Model[js.Any, js.Any, js.Any]]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * A hash of attributes to describe your search. See above for examples.
    *
    * We did put Object in the end, because there where query might be a JSON Blob. It cripples a bit the
    * typesafety, but there is no way to pass the tests if we just remove it.
    */
  type Primitives = java.lang.String | scala.Double | scala.Boolean | typingsJapgolly.node.Buffer
  type TransactionIsolationLevel = typingsJapgolly.sequelize.mod.TransactionIsolationLevelReadUncommitted | typingsJapgolly.sequelize.mod.TransactionIsolationLevelReadCommitted | typingsJapgolly.sequelize.mod.TransactionIsolationLevelRepeatableRead | typingsJapgolly.sequelize.mod.TransactionIsolationLevelSerializable
  type TransactionIsolationLevelReadCommitted = typingsJapgolly.sequelize.sequelizeStrings.`READ COMMITTED`
  type TransactionIsolationLevelReadUncommitted = typingsJapgolly.sequelize.sequelizeStrings.`READ UNCOMMITTED`
  type TransactionIsolationLevelRepeatableRead = typingsJapgolly.sequelize.sequelizeStrings.`REPEATABLE READ`
  type TransactionIsolationLevelSerializable = typingsJapgolly.sequelize.sequelizeStrings.SERIALIZABLE
  type TransactionLockLevel = typingsJapgolly.sequelize.mod.TransactionLockLevelUpdate | typingsJapgolly.sequelize.mod.TransactionLockLevelShare | typingsJapgolly.sequelize.mod.TransactionLockLevelKeyShare | typingsJapgolly.sequelize.mod.TransactionLockLevelNoKeyUpdate
  type TransactionLockLevelKeyShare = typingsJapgolly.sequelize.sequelizeStrings.`KEY SHARE`
  type TransactionLockLevelNoKeyUpdate = typingsJapgolly.sequelize.sequelizeStrings.`NO KEY UPDATE`
  type TransactionLockLevelShare = typingsJapgolly.sequelize.sequelizeStrings.SHARE
  type TransactionLockLevelUpdate = typingsJapgolly.sequelize.sequelizeStrings.UPDATE
  type TransactionType = typingsJapgolly.sequelize.mod.TransactionTypeDeferred | typingsJapgolly.sequelize.mod.TransactionTypeImmediate | typingsJapgolly.sequelize.mod.TransactionTypeExclusive
  type TransactionTypeDeferred = typingsJapgolly.sequelize.sequelizeStrings.DEFERRED
  type TransactionTypeExclusive = typingsJapgolly.sequelize.sequelizeStrings.EXCLUSIVE
  type TransactionTypeImmediate = typingsJapgolly.sequelize.sequelizeStrings.IMMEDIATE
  type WhereOptions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? sequelize.sequelize.Primitives | std.Array<sequelize.sequelize.Primitives> | sequelize.sequelize.WhereLogic | T[P] extends sequelize.sequelize.Primitives? null : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias sequelize.sequelize.WhereOptions<T[P]> * / object | sequelize.sequelize.col | sequelize.sequelize.and | sequelize.sequelize.or | sequelize.sequelize.WhereGeometryOptions | sequelize.sequelize.WhereNested | sequelize.sequelize.where | null}
    */ typingsJapgolly.sequelize.sequelizeStrings.WhereOptions with T
}
